package com.broaderator.mcserver.kernelcore.proc;

import com.broaderator.mcserver.kernelcore.$;
import com.broaderator.mcserver.kernelcore.Logger;
import com.broaderator.mcserver.kernelcore.KernelObject;

import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueProcess extends Process {
    /*private int status;
    private Processor<Object> processor;
    private Object wait = new Object();
    private ConcurrentLinkedQueue<Object> queue = new ConcurrentLinkedQueue<>();

    public QueueProcess(KernelObject origin, Processor<Object> processor, String name) {
        super(origin, name);
        this.processor = processor;
    }

    public void run() {
        boolean alive = true;
        while (alive) {
            if (!queue.isEmpty()) {
                this.status = 2;
                int code = this.processor.process(queue.remove());
                if (code != 0) {
                    Logger.error(owner, this.getName() + ": Processor task exited with code " + code);
                } else {
                    Logger.debug(owner, this.getName() + ": Processor task exited with success", $.DL_INFO);
                }
                this.status = 1;
            } else while (queue.isEmpty()) {
                if (this.isInterrupted()) {
                    Logger.debug(owner, this.getName() + ": Received Interrupt - exiting", $.DL_INFO);
                    alive = false;
                    break;
                }
            }
        }
    }

    public boolean offer(Object obj) {
        return queue.offer(obj);
    }

    public int getStatus() {
        return status;
    }*/
}
