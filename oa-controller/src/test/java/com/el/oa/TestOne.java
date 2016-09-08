package com.el.oa;

import java.io.File;

/**
 * 　　　　　　　　┏┓　　　┏┓+ +
 * 　　　　　　　┏┛┻━━━┛┻┓ + +
 * 　　　　　　　┃　　　　　　　┃
 * 　　　　　　　┃　　　━　　　┃ ++ + + +
 * 　　　　　　 ████━████ ┃+
 * 　　　　　　　┃　　　　　　　┃ +
 * 　　　　　　　┃　　　┻　　　┃
 * 　　　　　　　┃　　　　　　　┃ + +
 * 　　　　　　　┗━┓　　　┏━┛
 * 　　　　　　　　　┃　　　┃
 * 　　　　　　　　　┃　　　┃ + + + +
 * 　　　　　　　　　┃　　　┃　　　　Code is far away from bug with the animal protecting
 * 　　　　　　　　　┃　　　┃ + 　　　　神兽保佑,代码无bug
 * 　　　　　　　　　┃　　　┃
 * 　　　　　　　　　┃　　　┃　　+
 * 　　　　　　　　　┃　 　　┗━━━┓ + +
 * 　　　　　　　　　┃ 　　　　　　　┣┓
 * 　　　　　　　　　┃ 　　　　　　　┏┛
 * 　　　　　　　　　┗┓┓┏━┳┓┏┛ + + + +
 * 　　　　　　　　　　┃┫┫　┃┫┫
 * 　　　　　　　　　　┗┻┛　┗┻┛+ + + +
 *
 * @User : Hapic
 * @Date : 2016/8/2 20:05
 */
public class TestOne {

    public static void main(String[] args) {
        File file = validExistFile("video.eloancn.com");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
    }



    public static File validExistFile(String domain){
        String urlFileName = "";
        //获取视频文件所在目录
        String streamsPath = "E:\\downurl\\flv\\flv";
        String streamsPathTmp = "";
        File file = null;
        int flag = 0;
        if (null!=domain && !"".equals(domain.trim())) {
            String index = domain.substring(5, 6);
            if(".".equals(index.trim())){
//					video
                streamsPathTmp = streamsPath +"\\" + "234567" + ".flv";
                System.out.println("video--");
            }else if("1".equals(index.trim())){
//					video1
                streamsPathTmp = streamsPath + index + "\\" + "234567" + ".flv";
                flag = 1;
                System.out.println("video1--");
            }else{
//					video2
                streamsPathTmp = streamsPath + index + "\\" + "234567" + ".flv";
                flag = 2;
                System.out.println("video2--");
            }
            file = new File(streamsPathTmp);
            if(!file.exists()){
                switch (flag){
                    case 0:
                        System.out.println("swith--video01--");
                        streamsPathTmp = streamsPath + "1" + "\\" + "234567" + ".flv";
                        file = new File(streamsPathTmp);
                        System.out.println(file.exists()+"-----"+streamsPathTmp);
                        if(!file.exists()){
                            System.out.println("swith--video02--");
                            streamsPathTmp = streamsPath + "2" + "\\" + "234567" + ".flv";
                            break;
                        }else{
                            break;
                        }
                    case 1:
                        streamsPathTmp = streamsPath + "2" + "\\" + "234567" + ".flv";
                        file = new File(streamsPath);
                        System.out.println("swith--video12--");
                        if(!file.exists()){
                            System.out.println("swith--video10--");
                            streamsPathTmp = streamsPath  + "\\" + "234567" + ".flv";
                            break;
                        }else{
                            break;
                        }
                    case 2:
                        streamsPathTmp = streamsPath + "1" + "\\" + "234567" + ".flv";
                        file = new File(streamsPathTmp);
                        System.out.println("swith--video21--");
                        if(!file.exists()){
                            streamsPathTmp = streamsPath  + "\\" + "234567" + ".flv";
                            System.out.println("swith--video20--");
                            break;
                        }else{
                            break;
                        }
                    default:
                        streamsPathTmp = streamsPath  + "\\" + "234567" + ".flv";
                        System.out.println("default--video01--");
                }
            }

        }else{
            streamsPathTmp = streamsPath +"\\" + "234567" + ".flv";
        }

        if(null==file||!file.exists()){
            file = new File(streamsPathTmp);
        }

        if(!file.exists()){

            return file;
        }

        return file;

    }



}
