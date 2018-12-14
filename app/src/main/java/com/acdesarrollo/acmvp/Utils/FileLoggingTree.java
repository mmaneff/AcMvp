package com.acdesarrollo.acmvp.Utils;

//public class FileLoggingTree extends Timber.DebugTree {
public class FileLoggingTree  {

    private static final String LOGTAG = FileLoggingTree.class.getSimpleName();
    private static final String LOG_DIRECTORY = "/FaceLogs";

//    private Context context;
//
//    public FileLoggingTree(Context context) {
//        this.context = context;
//    }
//
//    @Override
//    public void log(int priority, Throwable t) {
//        try {
//            File direct = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + LOG_DIRECTORY);
//
//            if (!direct.exists()) {
//                direct.mkdir();
//            }
//
//            String fileNameTimeStamp = new SimpleDateFormat("dd_MM_yyyy", Locale.getDefault()).format(new Date());
//            String logTimeStamp = new SimpleDateFormat("E MMM dd yyyy 'at' hh:mm:ss:SSS aaa",
//                    Locale.getDefault()).format(new Date());
//
//            String fileName = "face_" + fileNameTimeStamp + ".txt";
//
//            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + LOG_DIRECTORY + File.separator + fileName);
//
//            file.createNewFile();
//
//            if (file.exists()) {
//                OutputStream fileOutputStream = new FileOutputStream(file, true);
//
//                fileOutputStream.write(("<p style=\"background:lightgray;\"><strong style=\"background:lightblue;\">&nbsp&nbsp" + logTimeStamp + " :&nbsp&nbsp</strong>&nbsp&nbsp" + t.getMessage() + "</p>").getBytes());
//                fileOutputStream.close();
//            }
//
//        } catch (Exception e) {
//            Log.e(LOGTAG, "Error while logging into file : " + e);
//        }
//    }
//
//    @Override
//    public void log(int priority, String message, Object... args) {
//        try {
//            File direct = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + LOG_DIRECTORY);
//
//            if (!direct.exists()) {
//                direct.mkdir();
//            }
//
//            String fileNameTimeStamp = new SimpleDateFormat("dd_MM_yyyy", Locale.getDefault()).format(new Date());
//            String logTimeStamp = new SimpleDateFormat("E MMM dd yyyy 'at' hh:mm:ss:SSS aaa",
//                    Locale.getDefault()).format(new Date());
//
//            String fileName = "face_" + fileNameTimeStamp + ".txt";
//
//            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + LOG_DIRECTORY + File.separator + fileName);
//
//            file.createNewFile();
//
//            if (file.exists()) {
//                OutputStream fileOutputStream = new FileOutputStream(file, true);
//
//                fileOutputStream.write(("<p style=\"background:lightgray;\"><strong style=\"background:lightblue;\">&nbsp&nbsp" + logTimeStamp + " :&nbsp&nbsp</strong>&nbsp&nbsp" + message + "</p>").getBytes());
//                fileOutputStream.close();
//            }
//        } catch (Exception e) {
//            Log.e(LOGTAG, "Error while logging into file : " + e);
//        }
//    }
//
//    @Override
//    public void log(int priority, Throwable t, String message, Object... args) {
//        try {
//            File direct = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + LOG_DIRECTORY);
//
//            if (!direct.exists()) {
//                direct.mkdir();
//            }
//
//            String fileNameTimeStamp = new SimpleDateFormat("dd_MM_yyyy", Locale.getDefault()).format(new Date());
//            String logTimeStamp = new SimpleDateFormat("E MMM dd yyyy 'at' hh:mm:ss:SSS aaa",
//                    Locale.getDefault()).format(new Date());
//
//            String fileName = "face_" + fileNameTimeStamp + ".txt";
//
//            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + LOG_DIRECTORY + File.separator + fileName);
//
//            file.createNewFile();
//
//            if (file.exists()) {
//                OutputStream fileOutputStream = new FileOutputStream(file, true);
//
//                fileOutputStream.write(("<p style=\"background:lightgray;\"><strong style=\"background:lightblue;\">&nbsp&nbsp" + logTimeStamp + " :&nbsp&nbsp</strong>&nbsp&nbsp" + message + "</p>").getBytes());
//                fileOutputStream.close();
//            }
//
//        } catch (Exception e) {
//            Log.e(LOGTAG, "Error while logging into file : " + e);
//        }
//    }
//
//    private String getPrioriry(int priority) {
//        String value = "";
//        switch (priority){
//            case Log.ERROR:
//                value = "ERROR";
//                break;
//            case Log.ASSERT:
//                value = "ASSERT";
//                break;
//            case Log.DEBUG:
//                value = "DEBUG";
//                break;
//            case Log.INFO:
//                value = "INFO";
//                break;
//        }
//        return value;
//    }
//
//
//    @Override
//    protected void log(int priority, String tag, String message, Throwable throwable) {
//        try {
//            File direct = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + LOG_DIRECTORY);
//
//            if (!direct.exists()) {
//                direct.mkdir();
//            }
//
//            String fileNameTimeStamp = new SimpleDateFormat("dd_MM_yyyy", Locale.getDefault()).format(new Date());
//            String logTimeStamp = new SimpleDateFormat("E MMM dd yyyy 'at' hh:mm:ss:SSS aaa",
//                    Locale.getDefault()).format(new Date());
//
//            String fileName = "face_" + fileNameTimeStamp + ".txt";
//
//            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + LOG_DIRECTORY + File.separator + fileName);
//
//            file.createNewFile();
//
//            if (file.exists()) {
//                FileWriter writer = new FileWriter(file, true);
//                writer.append("")
//                        .append(logTimeStamp)
//                        .append(" : ")
//                        .append(tag)
//                        .append(" - ")
//                        .append(getPrioriry(priority) + " - ")
//                        .append(message)
//                        .append("")
//                        .append("\n");
//                writer.flush();
//                writer.close();
//            }
//        } catch (Exception e) {
//            Log.e(LOGTAG, "Error while logging into file : " + e);
//        }
//
//    }
//
//
//    /*  Helper method to create file*/
//    @Nullable
//    private static File generateFile(@NonNull String path, @NonNull String fileName) {
//        File file = null;
//        if (isExternalStorageAvailable()) {
//            String pathDirectory = Environment.DIRECTORY_DOWNLOADS + File.separator + path;
//            File root = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), pathDirectory);
//
//            if(!root.mkdirs()) {
//                Log.i("Test", "This path is already exist: " + root.getAbsolutePath());
//            }
//
//            file = new File(root, fileName);
//            try {
//                if (!file.createNewFile()) {
//                    Log.i("Test", "This file is already exist: " + file.getAbsolutePath());
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return file;
//    }
//
//    /* Helper method to determine if external storage is available*/
//    private static boolean isExternalStorageAvailable() {
//        return Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState());
//    }

}
