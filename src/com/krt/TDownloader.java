package com.krt;

public class TDownloader extends Thread {

    private String url;  //远程路径
    private String name;  // 存储名字

    public TDownloader(String url,String name){
        this.url = url;
        this.name = name;
    }

   @Override
    public void run() {
       WebDownloader webDownloader = new WebDownloader();
       webDownloader.downLoad(url,name);
       System.out.println(name);
   }

    public static void main(String[] args) {
        TDownloader tDownloader1 = new TDownloader("http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=0&spn=0&di=180730&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=3300305952%2C1328708913&os=188573792%2C343995474&simid=4174703319%2C828922280&adpicid=0&lpn=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fpic37.nipic.com%2F20140113%2F8800276_184927469000_2.png&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bgtrtv_z%26e3Bv54AzdH3Ffi5oAzdH3F9AzdH3F898AzdH3Flm808c0_z%26e3Bip4s&gsm=0&islist=&querylist=","1.jpg");
        TDownloader tDownloader2 = new TDownloader("http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=1&spn=0&di=144540&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=2153937626%2C1074119156&os=2973785003%2C2939226447&simid=4127171795%2C760771602&adpicid=0&lpn=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fk.zol-img.com.cn%2Fsjbbs%2F7692%2Fa7691515_s.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fkkf_z%26e3Bz5s_z%26e3Bv54_z%26e3BvgAzdH3Ff3kkfAzdH3F10_c99a_z%26e3Bip4s&gsm=0&islist=","2.jpg");
        TDownloader tDownloader3 = new TDownloader("http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=2&spn=0&di=110&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=1060387669%2C1498970204&os=3626511987%2C1744795126&simid=3379801103%2C457455490&adpicid=0&lpn=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fimg3.redocn.com%2Ftupian%2F20150312%2Fhaixinghezhenzhubeikeshiliangbeijing_3937174.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Ff7vwt_z%26e3B6j15vg_z%26e3Bv54AzdH3Ffitstwg2p7AzdH3Fnln0809_z%26e3Bip4s&gsm=0&islist=&querylist=","3.jpg");
        TDownloader tDownloader4 = new TDownloader("http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=3&spn=0&di=179740&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=234634259%2C4236876085&os=54892700%2C159557102&simid=3579428015%2C308375459&adpicid=0&lpn=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fpic15.nipic.com%2F20110628%2F1369025_192645024000_2.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bgtrtv_z%26e3Bv54AzdH3Ffi5oAzdH3F90088lb_z%26e3Bip4s&gsm=0&islist=&querylist=","4.jpg");

        // 启动线程
        tDownloader1.start();
        tDownloader2.start();
        tDownloader3.start();
        tDownloader4.start();
    }
}
