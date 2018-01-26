package com.hky.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/verification")
public class MakeCertPic {
		
	/**
	 * 加载验证码
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	 @RequestMapping("/verifyCode")
	 public void loadVerifyCode(HttpServletRequest request,HttpServletResponse response) throws IOException {
		// 1 高和宽
			int height = 30;
			int width = 60;
			//数据字典
			String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
			Random random = new Random();

			// 2 创建一个图片
			BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

			// 3 获得画板
			Graphics g = image.getGraphics();
			// 4 填充一个矩形
			// * 设置颜色
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, width, height);

			g.setColor(Color.WHITE);
			g.fillRect(1, 1, width - 2, height - 2);
			// * 设置字体
			g.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 25));

			//拼接验证码字符
			String code = "";
			// 5 写随机字
			for (int i = 0; i < 4; i++) {
				// 设置颜色--随机数
				g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
				// 获得随机字
				int index = random.nextInt(data.length());
				String str = data.substring(index, index + 1);
				code+=str;
				// 写入
				g.drawString(str, width / 6 * (i + 1), 20);
			}
			//将拼接好的验证码放入session中
			request.getSession().setAttribute("code", code);
			// 6 干扰线
			for (int i = 0; i < 3; i++) {
				// 设置颜色--随机数
				g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
				// 随机绘制先
				g.drawLine(random.nextInt(width), random.nextInt(height), random.nextInt(width), random.nextInt(height));
				// 随机点
				g.drawOval(random.nextInt(width), random.nextInt(height), 2, 2);
			}
			// end 将图片响应给浏览器
			ImageIO.write(image, "jpg", response.getOutputStream());
	 }
	 @RequestMapping("/checkVerifyCode")
	 @ResponseBody
	 public Map<String,Object> checkVerifyCode(String verifyCode,HttpServletRequest request){
		 boolean flag = false;
		 String code = (String) request.getSession().getAttribute("code");
		 if(verifyCode.equalsIgnoreCase(code)) {
			 flag = true;
		 }
		 Map<String,Object> map = new HashMap<String,Object>();
		 map.put("checkResult", flag);
		 return map;
	 }
	 
}
