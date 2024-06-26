//package ir.mzn.jrdc;
//
//import org.monte.media.Format;
//import org.monte.media.math.Rational;
//import org.monte.screenrecorder.ScreenRecorder;
//
//import java.awt.*;
//import java.io.File;
//import java.io.IOException;
//
//import static org.monte.media.AudioFormatKeys.*;
//import static org.monte.media.VideoFormatKeys.*;
//
//public class ScreenRecorderUtil extends ScreenRecorder {
//    public static ScreenRecorder screenRecorder;
//
//    public ScreenRecorderUtil(GraphicsConfiguration cfg, Rectangle captureArea, Format fileFormat, Format screenFormat, Format mouseFormat, Format audioFormat, File movieFolder) throws IOException, AWTException {
//        super(cfg, captureArea, fileFormat, screenFormat, mouseFormat, audioFormat, movieFolder);
//    }
//
//    public static void startRecord(File dir) throws Exception {
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        int width = screenSize.width;
//        int height = screenSize.height;
//
//        Rectangle captureSize = new Rectangle(0, 0, width, height);
//
//        GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
//        screenRecorder = new ScreenRecorderUtil(gc, captureSize, new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI), new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, 24, FrameRateKey, Rational.valueOf(15), QualityKey, 1.0f, KeyFrameIntervalKey, 15 * 60), new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black", FrameRateKey, Rational.valueOf(30)), null, dir);
//        screenRecorder.start();
//    }
//
//    public static void stopRecord() throws Exception {
//        screenRecorder.stop();
//    }
//}