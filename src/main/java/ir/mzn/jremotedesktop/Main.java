package ir.mzn.jremotedesktop;

import com.wet.wired.jsr.recorder.DesktopScreenRecorder;
import com.wet.wired.jsr.recorder.ScreenRecorder;
import com.wet.wired.jsr.recorder.ScreenRecorderListener;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        File dir = createMovieFolder();
        OutputStream out = new FileOutputStream(dir);
        ScreenRecorder screenRecorder = new DesktopScreenRecorder(out, new ScreenRecorderListener() {
            @Override
            public void frameRecorded(boolean fullFrame) throws IOException {
                System.out.println("AAAAA"+fullFrame);
            }

            @Override
            public void recordingStopped() {
                System.out.println("BBBBBBBBBBBBB");
            }
        });
            screenRecorder.startRecording();
            Thread.sleep(5000);
            screenRecorder.stopRecording();
//        RecordingConverter.main(new String[]{dir.getAbsolutePath()});
            out.flush();
        out.close();


//        ScreenRecorderUtil.startRecord(dir);
//        new WatchDir(dir.toPath(), true).processEvents();
    }

    public static File createMovieFolder() {
        String tmpdir = System.getProperty("java.io.tmpdir");
        File dir = new File(tmpdir + "/jrdc/" + System.currentTimeMillis());
        System.out.println(dir);
//        dir.mkdirs();
        return dir;
    }
}