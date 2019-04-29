package com.test.concurrency;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		 /* for (int i = 1; i <= 10; i++) {
			Calculator calc = new Calculator(i);
			Thread thread = new Thread(calc);
			thread.start();
		}*/

		/************************* Thread states **********************/
		/*Thread threads[] = new Thread[10];
		Thread.State status[] = new Thread.State[10];
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread(new Calculator(i));
			if (i % 2 == 0) {
				threads[i].setPriority(Thread.MAX_PRIORITY);
			} else {
				threads[i].setPriority(Thread.MIN_PRIORITY);
			}
			threads[i].setName("Thread " + i);
		}

		try {
			FileWriter writer = new FileWriter("c:\\users\\jitender.kumar\\documents\\log.txt");
			
			for (int i = 0; i < 10; i++) {
				writer.write("Main : Status of Thread " + i + " : " + threads[i].getState()+ "\n");
				status[i] = threads[i].getState();
			}

			for (int i = 0; i < 10; i++) {
				threads[i].start();
			}

			boolean finish = false;
			while (!finish) {
				for (int i = 0; i < 10; i++) {
					if (threads[i].getState() != status[i]) {
						writeThreadInfo(writer, threads[i],status[i]);
						status[i] = threads[i].getState();
					}
				}
				finish = true;
				for (int i = 0; i < 10; i++) {
					finish = finish && (threads[i].getState() == State.TERMINATED);
				}
			}
		} catch (Exception e) {

		}*/
		
		/************************* Interrupting running thread **********************/
		/* Thread task = new PrimeGenerator();
		System.out.println(System.currentTimeMillis());
		task.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {}
		task.interrupt();
		System.out.println(System.currentTimeMillis());*/
		
		/*FileSearch searcher = new FileSearch("c:\\users\\jitender.kumar\\documents\\test", "z");
		Thread thread = new Thread(searcher);
		thread.start();
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {}
		thread.interrupt();*/

		/************************* Sleeping and resuming thread **********************/
		/*Thread thread = new Thread(new FileClock());
		thread.start();
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt();*/
		
		/************************* Thread finalization with join **********************/
		/*DataSourcesLoader dsLoader = new DataSourcesLoader();
		Thread thread1 = new Thread(dsLoader,"DataSourceThread");
		NetworkConnectionsLoader ncLoader = new NetworkConnectionsLoader();
		Thread thread2 = new Thread(ncLoader,"NetworkConnectionLoader");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Main: Configuration has been loaded: %s\n",new Date());*/
		
		/************************* Creating and running daemon thread **********************/
		/*Deque<Event> deque = new ArrayDeque<>();
		WriterTask writer = new WriterTask(deque);
		for(int i = 0; i< 3; i++) {
			Thread thread = new Thread(writer);
			thread.start();
		}
		
		CleanerTask cleaner = new CleanerTask(deque);
		cleaner.start();*/
		
		/************************* Exception handling with threads **********************/
		/*Task task = new Task();
		Thread t1 = new Thread(task);
		t1.setUncaughtExceptionHandler(new ExceptionHandler());
		t1.start();*/
		
		/************************* Using Thread local variables **********************/
		/*UnsafeTask unsafeTask = new UnsafeTask();
		for(int i = 0; i < 10; i++) {
			Thread t1 = new Thread(unsafeTask);
			t1.start();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}*/
		
		/*SafeTask safeTask = new SafeTask();
		for(int i = 0; i < 10; i++) {
			Thread t1 = new Thread(safeTask);
			t1.start();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}*/
		
		/************************* Using ThreadGroup **********************/
		/*ThreadGroup threadGroup = new ThreadGroup("searcher");
		Result result = new Result();
		SearchTask searchTask = new SearchTask(result);
		
		for(int i = 0; i < 2; i++) {
			Thread thread = new Thread(threadGroup, searchTask);
			thread.start();
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.printf("Number of Threads: %d\n",threadGroup.activeCount());
		System.out.printf("Information about the Thread Group\n");
		threadGroup.list();
		
		Thread[] threads = new Thread[threadGroup.activeCount()];
		threadGroup.enumerate(threads);
		for (int i = 0; i < threadGroup.activeCount(); i++) {
			System.out.printf("Thread %s: %s\n", threads[i].getName(), threads[i].getState());
		}
		waitFinish(threadGroup);
		threadGroup.interrupt();*/
		
		/************************* Processing uncontrolled exception in threadgroup**********************/
		/*ThreadGroup threadGroup = new MyThreadGroup("MyThreadGroup");
		Task1 task = new Task1();
		
		for(int i = 0; i < 2; i++) {
			Thread thread = new Thread(threadGroup, task);
			thread.start();
		}*/
		
		/************************* Using ThreadFactory **********************/
		/*MyThreadFactory myThreadFactory = new MyThreadFactory("MyThreadFactory");
		Task2 task = new Task2();
		
		Thread thread;
		for(int i = 0; i < 10; i++) {
			thread = myThreadFactory.newThread(task);
			thread.start();
		}
		
		System.out.printf("Factory stats:\n");
		System.out.printf("%s\n",myThreadFactory.getStats());*/
		
		/************************* Using synchronization **********************/
		/*Account account = new Account();
		account.setBalance(1000);
		
		Company company = new Company(account);
		Thread companyThread = new Thread(company);
		
		Bank bank = new Bank(account);
		Thread bankThread = new Thread(bank);
		
		System.out.printf("Account : Initial Balance: %f\n",account.getBalance());
		companyThread.start();
		bankThread.start();
		
		try {
			companyThread.join();
			bankThread.join();
			System.out.printf("Account : Final Balance: %f\n", account.getBalance());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		/************************* Synchronization on different attributes **********************/
		/*Cinema cinema = new Cinema();
		TicketOffice1 ticketOffice1 = new TicketOffice1(cinema);
		Thread thread1 = new Thread(ticketOffice1, "TicketOffice1");

		TicketOffice2 ticketOffice2 = new TicketOffice2(cinema);
		Thread thread2 = new Thread(ticketOffice2, "TicketOffice2");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Cinema 1 Vacant Seats: %d\n",cinema.getVacantSeatsCinema1());
		System.out.printf("Cinema 2 Vacant Seats: %d\n",cinema.getVacantSeatsCinema2());*/
		
		/************************* Producer consumer using wait and notify **********************/
		/*EventStorage storage = new EventStorage();
		Producer producer = new Producer(storage);
		Thread thread1 = new Thread(producer);

		Consumer consumer = new Consumer(storage);
		Thread thread2 = new Thread(consumer);
		
		thread1.start();
		thread2.start();*/
		
		/************************* Synchronizing using lock **********************/
		/*PrintQueue printQueue = new PrintQueue();
		
		Thread thread[] = new Thread[10];
		for (int i = 0; i < 10; i++) {
			thread[i] = new Thread(new Job(printQueue), "Thread " + i);
		}

		for (int i = 0; i < 10; i++) {
			thread[i].start();
		}*/
		
		// To Test fairness property
		/*for (int i = 0; i < 10; i++) {
			thread[i].start();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
		
		/************************* QUERY - Synchronizing data using read-write locks **********************/
		/*PricesInfo pricesInfo = new PricesInfo();
		
		Reader readers[] = new Reader[5];
		Thread readerThreads[] = new Thread[5];
		
		for (int i = 0; i < 5; i++) {
			readers[i] = new Reader(pricesInfo);
			readerThreads[i] = new Thread(readers[i]);
		}
		
		Writer writer=new Writer(pricesInfo);
		Thread writerThreads = new Thread(writer);
		
		for (int i=0; i<5; i++) {
			readerThreads[i].start();
			}
		writerThreads.start();*/
		
		/************************* QUERY - Producer-consumer using lock and conditions **********************/
		/*FileMock mock = new FileMock(100, 10);
		Buffer buffer = new Buffer(20);
		
		Producer1 producer = new Producer1(mock, buffer);
		Thread threadProducer = new Thread(producer, "Producer");
		
		Consumer1 consumers[] = new Consumer1[3];
		Thread threadConsumers[] = new Thread[3];
		
		for (int i = 0; i < 3; i++) {
			consumers[i] = new Consumer1(buffer);
			threadConsumers[i] = new Thread(consumers[i], "Consumer " + i);
		}
		
		threadProducer.start();
		for (int i = 0; i < 3; i++) {
			threadConsumers[i].start();
		}*/
		
		// To Test fairness property
		/*for (int i = 0; i < 10; i++) {
			thread[i].start();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
		
		/************************* Using Semaphore **********************/
		/*PrintQueue1 printQueue = new PrintQueue1();
		Thread thread[] = new Thread[10];
		for (int i = 0; i < 10; i++) {
			thread[i] = new Thread(new Job1(printQueue), "Thread " + i);
		}

		for (int i = 0; i < 10; i++) {
			thread[i].start();
		}*/
		
		/************************* Concurrent access to multiple copies of a resource **********************/
		/*PrintQueue2 printQueue = new PrintQueue2();
		Thread thread[] = new Thread[10];
		for (int i = 0; i < 10; i++) {
			thread[i] = new Thread(new Job2(printQueue), "Thread " + i);
		}

		for (int i = 0; i < 10; i++) {
			thread[i].start();
		}*/
		
		/************************* Count down latch **********************/
		/*Videoconference conference = new Videoconference(10);
		Thread confThread = new Thread(conference);
		confThread.start();
		
		for (int i = 0; i < 10; i++) {
			Participant p = new Participant(conference, "Participant " + i);
			Thread t = new Thread(p);
			t.start();
		}*/
		
		/************************* Cyclic Barrier **********************/
		/*final int ROWS = 1000;
		final int NUMBERS = 100;
		final int SEARCH = 5;
		final int PARTICIPANTS = 5;
		final int LINES_PARTICIPANT = 200;
		
		MatrixMock mock = new MatrixMock(ROWS, NUMBERS, SEARCH);
		Results results = new Results(ROWS);
		Grouper grouper = new Grouper(results);
		CyclicBarrier barrier = new CyclicBarrier(PARTICIPANTS, grouper);
		Searcher searchers[] = new Searcher[PARTICIPANTS];
		
		for (int i = 0; i < PARTICIPANTS; i++) {
			searchers[i] = new Searcher(i * LINES_PARTICIPANT, (i * LINES_PARTICIPANT) + LINES_PARTICIPANT, mock,
					results, 5, barrier);
			Thread thread = new Thread(searchers[i]);
			thread.start();
		}
		System.out.printf("Main: The main thread has finished.\n");*/
		
		/************************* Phaser **********************/
		/*Phaser phaser = new Phaser(3);
		FileSearch1 document = new FileSearch1("C:\\Users\\jitender.kumar\\Documents\\NDA", "pdf", phaser);
		FileSearch1 backup = new FileSearch1("C:\\Users\\jitender.kumar\\Documents\\backup_Docs", "pdf", phaser);
		FileSearch1 travel= new FileSearch1("C:\\Users\\jitender.kumar\\Documents\\Travel", "pdf", phaser);
		Thread docThread = new Thread(document, "Document");
		docThread.start();
		Thread backupThread = new Thread(backup, "Backup");
		backupThread.start();
		Thread travelThread = new Thread(travel, "Travel");
		travelThread.start();
		try {
			docThread.join();
			backupThread.join();
			travelThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Terminated: " + phaser.isTerminated());*/
		
		/************************* Exchanger **********************/
		/*List<String> buffer1=new ArrayList<>();
		List<String> buffer2=new ArrayList<>();
		
		Exchanger<List<String>> exchanger=new Exchanger<>();
		
		Producer2 producer=new Producer2(buffer1, exchanger);
		Consumer2 consumer=new Consumer2(buffer2, exchanger);
		
		Thread threadProducer=new Thread(producer);
		Thread threadConsumer=new Thread(consumer);
		threadProducer.start();
		threadConsumer.start();*/
		
		/************************* Executor Framework **********************/
		/*Server server = new Server();
		for (int i = 0; i < 10; i++) {
			Task3 task = new Task3("Task " + i);
			server.executeTask(task);
		}
		server.endServer();*/
		
		/************************* Executor Framework with Callable **********************/
		/*ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		List<Future<Integer>> resultList = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			Integer number = random.nextInt(10);
			FactorialCalculator calculator = new FactorialCalculator(number);
			Future<Integer> result = executor.submit(calculator);
			resultList.add(result);
		}

		do {
			System.out.printf("Main: Number of Completed Tasks: %d\n", executor.getCompletedTaskCount());
			for (int i = 0; i < resultList.size(); i++) {
				Future<Integer> result = resultList.get(i);
				System.out.printf("Main: Task %d: %s\n", i, result.isDone());
			}
			try {
				TimeUnit.MILLISECONDS.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} while (executor.getCompletedTaskCount() < resultList.size());

		System.out.printf("Main: Results\n");
		for (int i = 0; i < resultList.size(); i++) {
			Future<Integer> result = resultList.get(i);

			Integer number = null;
			try {
				number = result.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
			System.out.printf("Main: Task %d: %d\n", i, number);
		}
		executor.shutdown();*/
		
		/************************* Processing First result with Executor **********************/
		/*String username = "test";
		String password = "test";

		UserValidator ldapValidator = new UserValidator("LDAP");
		UserValidator dbValidator = new UserValidator("DataBase");

		TaskValidator ldapTask = new TaskValidator(ldapValidator, username, password);
		TaskValidator dbTask = new TaskValidator(dbValidator, username, password);

		List<TaskValidator> taskList = new ArrayList<>();
		taskList.add(ldapTask);
		taskList.add(dbTask);

		ExecutorService executor = (ExecutorService) Executors.newCachedThreadPool();
		String result;

		try {
			result = executor.invokeAny(taskList);
			System.out.printf("Main: Result: %s\n", result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		executor.shutdown();
		System.out.printf("Main: End of the Execution\n");*/
		
		/************************* ScheduledThreadPool Executor **********************/
		/*ScheduledThreadPoolExecutor executor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(1);
		System.out.printf("Main: Starting at: %s\n", new Date());
		for (int i = 0; i < 5; i++) {
			Task4 task = new Task4("Task " + i);
			executor.schedule(task, i + 1, TimeUnit.SECONDS);
		}
		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Main: Ends at: %s\n", new Date());*/
		
		/************************* Controlling/Finishing task in Executor **********************/
		/*ExecutorService executor = (ExecutorService) Executors.newCachedThreadPool();
		ResultTask resultTasks[] = new ResultTask[5];
		for (int i = 0; i < 5; i++) {
			ExecutableTask executableTask = new ExecutableTask("Task " + i);
			resultTasks[i] = new ResultTask(executableTask);
			executor.submit(resultTasks[i]);
		}
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i < resultTasks.length; i++) {
			resultTasks[i].cancel(true);
		}
		for (int i = 0; i < resultTasks.length; i++) {
			try {
				if (!resultTasks[i].isCancelled())
					System.out.printf("%s\n", resultTasks[i].get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		executor.shutdown();*/
		
		/************************* Using CompletionService in Executor **********************/
		/*ExecutorService executor = Executors.newCachedThreadPool();
		CompletionService<String> service = new ExecutorCompletionService(executor);

		ReportRequest faceRequest = new ReportRequest("Face", service);
		ReportRequest onlineRequest = new ReportRequest("Online", service);

		Thread faceThread = new Thread(faceRequest);
		Thread onlineThread = new Thread(onlineRequest);

		ReportProcessor processor = new ReportProcessor(service);
		Thread senderThread = new Thread(processor);

		System.out.printf("Main: Starting the Threads\n");
		faceThread.start();
		onlineThread.start();
		senderThread.start();

		try {
			System.out.printf("Main: Waiting for the report generators.\n");
			faceThread.join();
			onlineThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Main: Shutting down the executor.\n");
		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		processor.setEnd(true);
		System.out.println("Main: Ends");*/
		
		/************************* Controlling rejected task in Executor **********************/
		/*RejectedTaskController controller = new RejectedTaskController();
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		executor.setRejectedExecutionHandler(controller);
		System.out.printf("Main: Starting.\n");
		for (int i = 0; i < 3; i++) {
			Task5 task = new Task5("Task" + i);
			executor.submit(task);
		}
		System.out.printf("Main: Shutting down the Executor.\n");
		executor.shutdown();

		System.out.printf("Main: Sending another Task.\n");
		Task5 task = new Task5("RejectedTask");
		executor.submit(task);

		System.out.println("Main: End");
		System.out.printf("Main: End.\n");*/
	}

	private static void writeThreadInfo(FileWriter pw, Thread thread, State state) throws IOException {
		pw.write("\nMain : Id "+ thread.getId() +" - " + thread.getName() +"\n");
		pw.write("Main : Priority: " + thread.getPriority() + "\n");
		pw.write("Main : Old State: " + state + " \n");
		pw.write("Main : New State: " + thread.getState() + "\n");
		pw.write("Main : ************************************\n");
	}
	
	private static void waitFinish(ThreadGroup threadGroup) {
		while(threadGroup.activeCount() > 1) {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
