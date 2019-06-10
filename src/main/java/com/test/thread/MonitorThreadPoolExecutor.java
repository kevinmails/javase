package com.test.thread;

import java.util.concurrent.*;

/**
 * @author 陈彬
 *         Date 2017/11/15
 *         Time 13:34
 */
public class MonitorThreadPoolExecutor extends ThreadPoolExecutor {
    public MonitorThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

    public MonitorThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory);
    }

    public MonitorThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, handler);
    }

    public MonitorThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler);
    }

    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        System.out.println("线程："+ t.getName() + "开始执行...");
        System.out.println(t.getName() + " poolSize:" + this.getPoolSize() + " corePoolSize:" + this.getCorePoolSize()
                + " queueSize:" + this.getQueue().size());
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
    }

    @Override
    protected void terminated() {
    }
}
