package com.dhy.activeobject;/**
 * Created by lvaolin on 17/11/23.
 */

/**
 * @author lvaolin
 * @create 17/11/23 下午8:08
 */
public class SchedulerThread extends Thread {

    private final ActivationQueue queue;

    public SchedulerThread(ActivationQueue queue){
        this.queue = queue;
    }

    public void  invoke(MethodRequest request){
        queue.putRequest(request);
    }

    @Override
    public void run() {
        while (true){
            MethodRequest request = queue.takeRequest();
            request.execute();
        }
    }
}
