/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.panels;

import com.nuckrieg.degredon.specifics.Player;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Ana
 */
public final class OldGamePanel extends javax.swing.JPanel  implements Serializable {

    float scale = 1.54f;
    
    boolean whatBackground = new Random().nextBoolean();
    //  int ground = 377;

//    private final BufferedImage player;
//    private final Image background;
//    private final Character character;
//    private final Player player;
    private final Player player1;
    private final Player player2;
    Image background;

    /**
     * Creates new form NewJPanel
     *
     * @param player1
     * @param player2
     */
    public OldGamePanel(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        initComponents();
        

    }

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        

     //   background = whatBackground ? this.player1.getCharacter().getBackground() : this.player2.getCharacter().getBackground();

        // do your drawing
        // e.g. - if you have an image that you want to draw...
        // this draws the image at coordinate (0, 0) = upper left corner in your panel
        // use g2d.drawImage methods to paint …
        // if (character != null && character.getBackground() != null) {
        JFrame mother = (JFrame) SwingUtilities.windowForComponent(this);
        int frameHeight = this.getHeight();
        int frameWidth = this.getWidth();

        BufferedImage player1Image = player1.getCharacter().finalizeCharacter(player1.getCharacter());
        BufferedImage player2Image = player2.getCharacter().finalizeCharacter(player2.getCharacter());
        //  ImageResizer imageResizer = new ImageResizer();
        int width = background.getWidth(this);
        int height = background.getHeight(this);
//            System.out.println("W: " + width);
//            System.out.println("H: " + height);
        float divide = (float) width / (float) height;
//            System.out.println("D: " + divide);
//            System.out.println("SHOULD BE: " + (int) (frameHeight * divide));
        float i = 1.0f;
        while (width < frameWidth || height < frameHeight) {

            width = (int) (width * i);
            height = (int) (height * i);
            g.drawImage(background, 0, frameHeight - height, width, height, this);
//                System.out.println("NEW W: " + width);
//                System.out.println("NEW H: " + height);
//                System.out.println("NEW D: " + i);
            i += 0.0001;
        }
//            System.out.println("O QUE FICA MAIOR??? "+(float)frameWidth/(float)frameHeight);
//            scale = (float)frameWidth/(float)frameHeight
        // background = background.getScaledInstance(1400, 900, BufferedImage.SCALE_SMOOTH);
        //g.drawImage(background, 0, 0, (int) (frameHeight * divide), frameHeight, this);
        //   g.drawImage(player.getScaledInstance((int) ((scale / player.getWidth())+1), (int) (player.((scale / player.getHeight()) + 1)), BufferedImage.SCALE_SMOOTH), 100, frameHeight - 500, this);

        /*Player1*/ g.drawImage(player1Image.getScaledInstance((int) (player1Image.getWidth() / scale), (int) (player1Image.getHeight() / scale), BufferedImage.SCALE_SMOOTH), 100, frameHeight - 500, this);
        /*Player2*/ g.drawImage(flip(toBufferedImage(player2Image.getScaledInstance((int) (player2Image.getWidth() / scale), (int) (player2Image.getHeight() / scale), BufferedImage.SCALE_SMOOTH))), frameWidth - player2Image.getScaledInstance((int) (player2Image.getWidth() / scale), (int) (player2Image.getHeight() / scale), BufferedImage.SCALE_SMOOTH).getWidth(null) - 100, frameHeight - 500, this);
        g.dispose();
        //   
        //    }

    }

//    public BufferedImage xpto(BufferedImage img) {
//        try {
////            File imageFile = new File("InputFile");
//
//            ImageInputStream imageStream = ImageIO.createImageInputStream(img);
//
//            ImageFrame[] frames = readGif(imageStream);
//            for (int i = 0; i < frames.length; i++) {
//                //code to resize the image
//                ImageResizer resizer = new ImageResizer();
//                BufferedImage image = resizer.resize(frames[i].getImage(), 1440, 900);
//                frames[i].setImage(image);
//            }
//
//            ImageOutputStream output
//                    = new FileImageOutputStream(new File("OutputFile"));
//
//            GifSequenceWriter writer
//                    = new GifSequenceWriter(output, frames[0].getImage().getType(), frames[0].getDelay(), true);
//
//            writer.writeToSequence(frames[0].getImage());
//            for (int i = 1; i < frames.length; i++) {
//                BufferedImage nextImage = frames[i].getImage();
//                writer.writeToSequence(nextImage);
//            }
//
//            writer.close();
//            output.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        } catch (IOException e) {
//            System.out.println("IO Exception");
//        }
//        return null;
//    }
//    private ImageFrame[] readGif(ImageInputStream stream) throws IOException {
//        ArrayList<ImageFrame> frames = new ArrayList<ImageFrame>(2);
//
//        ImageReader reader = (ImageReader) ImageIO.getImageReadersByFormatName("gif").next();
//        reader.setInput(stream);
//
//        int lastx = 0;
//        int lasty = 0;
//
//        int width = -1;
//        int height = -1;
//
//        IIOMetadata metadata = reader.getStreamMetadata();
//
//        Color backgroundColor = null;
//
//        if (metadata != null) {
//            IIOMetadataNode globalRoot = (IIOMetadataNode) metadata.getAsTree(metadata.getNativeMetadataFormatName());
//
//            NodeList globalColorTable = globalRoot.getElementsByTagName("GlobalColorTable");
//            NodeList globalScreeDescriptor = globalRoot.getElementsByTagName("LogicalScreenDescriptor");
//
//            if (globalScreeDescriptor != null && globalScreeDescriptor.getLength() > 0) {
//                IIOMetadataNode screenDescriptor = (IIOMetadataNode) globalScreeDescriptor.item(0);
//
//                if (screenDescriptor != null) {
//                    width = Integer.parseInt(screenDescriptor.getAttribute("logicalScreenWidth"));
//                    height = Integer.parseInt(screenDescriptor.getAttribute("logicalScreenHeight"));
//                }
//            }
//
//            if (globalColorTable != null && globalColorTable.getLength() > 0) {
//                IIOMetadataNode colorTable = (IIOMetadataNode) globalColorTable.item(0);
//
//                if (colorTable != null) {
//                    String bgIndex = colorTable.getAttribute("backgroundColorIndex");
//
//                    IIOMetadataNode colorEntry = (IIOMetadataNode) colorTable.getFirstChild();
//                    while (colorEntry != null) {
//                        if (colorEntry.getAttribute("index").equals(bgIndex)) {
//                            int red = Integer.parseInt(colorEntry.getAttribute("red"));
//                            int green = Integer.parseInt(colorEntry.getAttribute("green"));
//                            int blue = Integer.parseInt(colorEntry.getAttribute("blue"));
//
//                            backgroundColor = new Color(red, green, blue);
//                            break;
//                        }
//
//                        colorEntry = (IIOMetadataNode) colorEntry.getNextSibling();
//                    }
//                }
//            }
//        }
//
//        BufferedImage master = null;
//        boolean hasBackround = false;
//
//        for (int frameIndex = 0;; frameIndex++) {
//            BufferedImage image;
//            try {
//                image = reader.read(frameIndex);
//            } catch (IndexOutOfBoundsException io) {
//                break;
//            }
//
//            if (width == -1 || height == -1) {
//                width = image.getWidth();
//                height = image.getHeight();
//            }
//
//            IIOMetadataNode root = (IIOMetadataNode) reader.getImageMetadata(frameIndex).getAsTree("javax_imageio_gif_image_1.0");
//            IIOMetadataNode gce = (IIOMetadataNode) root.getElementsByTagName("GraphicControlExtension").item(0);
//            NodeList children = root.getChildNodes();
//
//            int delay = Integer.valueOf(gce.getAttribute("delayTime"));
//
//            String disposal = gce.getAttribute("disposalMethod");
//
//            if (master == null) {
//                master = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
//                master.createGraphics().setColor(backgroundColor);
//                master.createGraphics().fillRect(0, 0, master.getWidth(), master.getHeight());
//
//                hasBackround = image.getWidth() == width && image.getHeight() == height;
//
//                master.createGraphics().drawImage(image, 0, 0, null);
//            } else {
//                int x = 0;
//                int y = 0;
//
//                for (int nodeIndex = 0; nodeIndex < children.getLength(); nodeIndex++) {
//                    Node nodeItem = children.item(nodeIndex);
//
//                    if (nodeItem.getNodeName().equals("ImageDescriptor")) {
//                        NamedNodeMap map = nodeItem.getAttributes();
//
//                        x = Integer.valueOf(map.getNamedItem("imageLeftPosition").getNodeValue());
//                        y = Integer.valueOf(map.getNamedItem("imageTopPosition").getNodeValue());
//                    }
//                }
//
//                if (disposal.equals("restoreToPrevious")) {
//                    BufferedImage from = null;
//                    for (int i = frameIndex - 1; i >= 0; i--) {
//                        if (!frames.get(i).getDisposal().equals("restoreToPrevious") || frameIndex == 0) {
//                            from = frames.get(i).getImage();
//                            break;
//                        }
//                    }
//
//                    {
//                        ColorModel model = from.getColorModel();
//                        boolean alpha = from.isAlphaPremultiplied();
//                        WritableRaster raster = from.copyData(null);
//                        master = new BufferedImage(model, raster, alpha, null);
//                    }
//                } else if (disposal.equals("restoreToBackgroundColor") && backgroundColor != null) {
//                    if (!hasBackround || frameIndex > 1) {
//                        master.createGraphics().fillRect(lastx, lasty, frames.get(frameIndex - 1).getWidth(), frames.get(frameIndex - 1).getHeight());
//                    }
//                }
//                master.createGraphics().drawImage(image, x, y, null);
//
//                lastx = x;
//                lasty = y;
//            }
//
//            {
//                BufferedImage copy;
//
//                {
//                    ColorModel model = master.getColorModel();
//                    boolean alpha = master.isAlphaPremultiplied();
//                    WritableRaster raster = master.copyData(null);
//                    copy = new BufferedImage(model, raster, alpha, null);
//                }
//                frames.add(new ImageFrame(copy, delay, disposal, image.getWidth(), image.getHeight()));
//            }
//
//            master.flush();
//        }
//        reader.dispose();
//
//        return frames.toArray(new ImageFrame[frames.size()]);
//    }
    public static BufferedImage toBufferedImage(Image img) {
        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }

        // Create a buffered image with transparency
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        // Draw the image on to the buffered image
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();

        // Return the buffered image
        return bimage;
    }

    BufferedImage flip(BufferedImage sprite) {
        BufferedImage img = new BufferedImage(sprite.getWidth(), sprite.getHeight(), BufferedImage.TYPE_INT_ARGB);
        for (int xx = sprite.getWidth() - 1; xx > 0; xx--) {
            for (int yy = 0; yy < sprite.getHeight(); yy++) {
                img.setRGB(sprite.getWidth() - xx, yy, sprite.getRGB(xx, yy));
            }
        }
        return img;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
