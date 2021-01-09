package com.nuckrieg.degredon.functions;

/* ImageResizer.java */
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class ImageResizer {

    public static BufferedImage resize(BufferedImage orignalImage, int width, int height) {

        BufferedImage origBuffImg = orignalImage;
        int type = origBuffImg.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : origBuffImg.getType();

        BufferedImage resizedBuffImg = new BufferedImage(width, height, type);
        Graphics2D g = resizedBuffImg.createGraphics();
        g.drawImage(origBuffImg, 0, 0, width, height, null);
        g.dispose();
        return resizedBuffImg;
//
//            String newFile = orignalImage.getAbsolutePath().substring(0, orignalImage.getAbsolutePath().lastIndexOf(".")) + "_" + width + "x" + height + "." + extension;
//            ImageIO.write(resizedBuffImg, extension, new File(newFile));
//
//            System.out.println("File created : " + newFile);

    }

}
