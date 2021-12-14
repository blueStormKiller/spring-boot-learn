package util;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * FileName: VerifyCodeUtil2
 * Description: 验证码工具类
 *
 * @author 17040708
 * Date:     2018/9/27 0027 11:57
 * Copyright (C), 2002-2018, 苏宁易购电子商务有限公司. All rights reserved.
 * Use is subject to license terms.
 */
public class VerifyCodeUtil2 {

    /**
     * 验证码图片的宽度
     */
    private static int width = 130;
    /**
     * 验证码图片的高度
     */
    private static int height = 45;

    private static int x = 0;
    /**
     * 字体高度
     */
    private static int fontHeight;
    private static int codeY;
    private static char[] codeSequence = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    private VerifyCodeUtil2() {
    }

    private static void initParams(int size) {
        x = width / (size + 1);
        //初始化验证图片属性
        fontHeight = height - 2;
        codeY = height - 4;
    }

    /**
     * 生成一个指定位数的字符串
     */
    public static String genCaptcha(int count) {
        StringBuilder captcha = new StringBuilder();
        for (int i = 0; i < count; i++) {
            Random r = new Random();
            //随机选取一个字母或数字
            char c = codeSequence[r.nextInt(codeSequence.length)];
            captcha.append(c);
        }
        return captcha.toString();
    }

    /**
     * 根据指定的字符串生成对应验证码图片
     * 与 method genCaptcha 配合使用
     */
    public static BufferedImage genCaptchaImg(String verifyCode) {
        initParams(verifyCode.length());
        // 定义图像buffer
        BufferedImage buffImg = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g = buffImg.createGraphics();
        // 创建一个随机数生成器类
        Random random = new Random();
        // 将图像填充为白色
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);
        // 创建字体，字体的大小应该根据图片的高度来定。
        Font font = new Font("Fixedsys", Font.PLAIN, fontHeight);
        // 设置字体。
        g.setFont(font);
        // 画边框。
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, width - 1, height - 1);
        g.setColor(Color.BLACK);
        // 随机产生50条干扰线，使图象中的认证码不易被其它程序探测到。
        int interferenceSize = 80;
        for (int i = 0; i < interferenceSize; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int xl = random.nextInt(12);
            int yl = random.nextInt(12);
            g.drawLine(x, y, x + xl, y + yl);
        }
        char[] chars = verifyCode.toCharArray();
        int red;
        int green;
        int blue;
        // 随机产生codeCount数字的验证码。
        for (int i = 0; i < chars.length; i++) {
            // 产生随机的颜色分量来构造颜色值，这样输出的每位数字的颜色值都将不同。
            red = random.nextInt(125);
            green = random.nextInt(125);
            blue = random.nextInt(125);
            // 用随机产生的颜色将验证码绘制到图像中。
            g.setColor(new Color(red, green, blue));
            g.drawString(String.valueOf(chars[i]), i * x, codeY);
        }
        return buffImg;
    }
}