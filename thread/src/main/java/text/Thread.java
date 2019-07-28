package text;


import java.util.concurrent.*;

/**
 * 通过提供的接口Excutors来创建线程池
 * 1.通过newCachedThreadPool创建一个可缓存线程池。
 */
public class Thread extends java.lang.Thread {
//
//    public static void main(String[] args) {
//        ExecutorService threadpool = Executors.newCachedThreadPool();//
//        int num =3;//创建线程数
//        for (int i=0;i<num;i++){
//            threadpool.execute(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Thread.currentThread().getName());
//                }
//            });
//        }
//
//    }
    /**
     * 通过newFixedThredaPool创建一个定长线程池
     * 假设我们固定定长为1，然后创建3个线程，那么他就会等第一个线程执行完了之后才会创建第2个线程
     * 所以可以发现，三个线程的名字是一样的，因为每个线程创建之后上一个线程已经执行完了
     */
//    public static void main(String[] args) {
//        ExecutorService threadPool = Executors.newFixedThreadPool(1);//定长一个
//        int num = 3;//创建3个线程
//        for (int i=0;i<num;i++){
//            System.out.println(Thread.currentThread().getName());
//            try{
//                Thread.sleep(2);
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//            System.out.println("休息一下，再来一个线程");
//        }
//    }
    /**
     * 通过newScheduledTreadPool创建一个延时线程池，
     */

//    public static void main(String[] args) {
//        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(1);
//        int num =3;
//        for (int i=0;i<num;i++){
//            final long t1 = System.currentTimeMillis();
//           threadPool.schedule(new Runnable() {
//               @Override
//               public void run() {
//                   System.out.println(Thread.currentThread().getName());
//                   //1.为了看出结果，给该方法打印一下时间，每一个线程之间都延迟了定义秒数
//                   long t2 = System.currentTimeMillis();
//                   System.out.println(t2-t1);
//               }
//           },5,TimeUnit.SECONDS);//设置了5秒，所以延迟5秒执行
//        }
//    }

    /**
     * 通过newSingleThreadExecutor来创建一个线程池
     * 这和其他线程池最大区别是不需要设置定长的数量
     * 它只允许同时运行一个线程，必须一个线程运行完才会运行下一个
     */
    public static void main(String[] args) {
        int num =3;
        ExecutorService threadPool = Executors.newSingleThreadExecutor();//设置数量
        for (int i=0;i<num;i++){
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
    }
}
