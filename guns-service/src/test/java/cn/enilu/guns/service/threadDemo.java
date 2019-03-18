package cn.enilu.guns.service;

public class threadDemo extends Thread {

    private String name;
    private String ob="aa";

     threadDemo(String name){
        this.name=name;
    }
    static int tick=200000;
    @Override
    public  void run() {
        long a=System.currentTimeMillis();
        while (tick>0){
            synchronized (ob){
                if(tick>0) {
                    System.out.println("店员："+name+"卖出了第"+tick+"钥匙");
                    tick--;
                }else{
                    System.out.println("卖完了");
                }
               /*try {
                   if (name.equals("B")){
                       Thread.sleep(100);
                   }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }*/

          }

        }
        System.out.println("\r<br>执行耗时 : "+(System.currentTimeMillis()-a)/1000f+" 秒 ");
    }
}
