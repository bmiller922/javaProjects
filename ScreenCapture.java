Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
Robot robot = new Robot();
BufferedImage img = robot.createScreenCapture(new Rectangle(size));
File save_path=new File("screen.jpg");
ImageIO.write(img, "JPG", save_path);	