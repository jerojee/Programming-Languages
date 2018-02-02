//Reader Writer program in Java
//uses threads
import java.util.concurrent.Semaphore;

class ReaderWriter{//ReaderWriter class

    static int numReaders = 0; //holds count for readers
    static Semaphore readerSem = new Semaphore(1); //reader lock
    static Semaphore writerSem = new Semaphore(1); //writer lock

    public static void main(String args[]){ // main
        Reader reader = new Reader();// create new reader object
        Writer writer = new Writer(); // create new writer object

        Thread firstThread = new Thread(reader); //create a reader thread
        Thread secondThread = new Thread(writer); //a writer thread
        Thread thirdThread = new Thread(reader); // reader thread

        firstThread.start(); //start thread 1
        secondThread.start(); //start thread 2
        thirdThread.start(); //start thread 3
    }

    static class Reader implements Runnable{ //Reader class
        public void run(){
            try{ //try

                readerSem.acquire(); //acquire reader semaphore
                numReaders++; //increment reader count

                if(numReaders == 1){ //if reader count == 1
                    writerSem.acquire(); //acquire writer semaphore
                }
                readerSem.release();//release reader semaphore

                System.out.println(Thread.currentThread() + ": Reading"); //print current thread
                Thread.sleep(1000); //thread active for 1000ms
                System.out.println(Thread.currentThread() + ": Finished reading"); //print current thread


                readerSem.acquire();//acquire reader semaphore
                numReaders--; //decrement reader count

                if(numReaders == 0){//if no one is reading
                    writerSem.release(); //release writer lock
                }
                readerSem.release(); //release reader semaphore
	    }catch(InterruptedException e){ System.err.println("Caught Exception: " + e.getMessage());} //catch exception
        }

    }

    static class Writer implements Runnable{ //Writer class
        public void run(){
            try{//try
                writerSem.acquire(); //acquire writer semaphore

                System.out.println(Thread.currentThread()+ ": Writing"); //print current thread
                Thread.sleep(3000); //thread active for 1000ms
                System.out.println(Thread.currentThread() + ": Finished writing"); //print when thread is done writing

                writerSem.release(); //release writer semaphore

            }catch(InterruptedException e){ System.err.println("Caught Exception: " + e.getMessage());} //catch exception
        }
    }
}

