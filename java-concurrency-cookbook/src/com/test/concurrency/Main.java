package com.test.concurrency;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.Thread.State;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
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
		
		/************************* Creating Fork Join Executor **********************/
		/*ProductListGenerator generator = new ProductListGenerator();
		List<Product> products = generator.generate(10000);

		Task6 task = new Task6(products, 0, products.size(), 0.20);
		ForkJoinPool pool = new ForkJoinPool();
		pool.execute(task);

		do {
			System.out.printf("Main: Thread Count: %d\n", pool.getActiveThreadCount());
			System.out.printf("Main: Thread Steal: %d\n", pool.getStealCount());
			System.out.printf("Main: Parallelism: %d\n", pool.getParallelism());
			try {
				TimeUnit.MILLISECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (!task.isDone());

		pool.shutdown();
		
		if (task.isCompletedNormally()) {
			System.out.printf("Main: The process has completed normally.\n");
		}

		for (int i = 0; i < products.size(); i++) {
			Product product = products.get(i);
			if (product.getPrice() != 12) {
				System.out.printf("Product %s: %f\n", product.getName(), product.getPrice());
			}
		}

		System.out.println("Main: End of the program.\n");*/
		
		/************************* Creating Fork JOIN Executor **********************/
		/*Document mock = new Document();
		String[][] document = mock.generateDocument(100, 1000, "the");

		DocumentTask task = new DocumentTask(document, 0, 100, "the");
		ForkJoinPool pool = new ForkJoinPool();
		pool.execute(task);

		do {
			System.out.printf("******************************************\n");
			System.out.printf("Main: Parallelism: %d\n", pool.getParallelism());
			System.out.printf("Main: Active Threads: %d\n", pool.getActiveThreadCount());
			System.out.printf("Main: Task Count: %d\n", pool.getQueuedTaskCount());
			System.out.printf("Main: Steal Count: %d\n", pool.getStealCount());
			System.out.printf("******************************************\n");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (!task.isDone());

		pool.shutdown();
		try {
			pool.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			System.out.printf("Main: The word appears %d in the document", task.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}*/
		
		/************************* Running task asynchronously in Fork Join **********************/
		/*ForkJoinPool pool = new ForkJoinPool();
		FolderProcessor nda = new FolderProcessor("C:\\Users\\jitender.kumar\\Documents\\NDA", "pdf");
		FolderProcessor travel = new FolderProcessor("C:\\Users\\jitender.kumar\\Documents\\Travel", "pdf");
		FolderProcessor term = new FolderProcessor("C:\\Users\\jitender.kumar\\Documents\\TermLifeDocs", "pdf");
		pool.execute(nda);
		pool.execute(travel);
		pool.execute(term);
		do {
			System.out.printf("******************************************\n");
			System.out.printf("Main: Parallelism: %d\n", pool.getParallelism());
			System.out.printf("Main: Active Threads: %d\n", pool.getActiveThreadCount());
			System.out.printf("Main: Task Count: %d\n", pool.getQueuedTaskCount());
			System.out.printf("Main: Steal Count: %d\n", pool.getStealCount());
			System.out.printf("******************************************\n");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while ((!nda.isDone()) || (!travel.isDone()) || (!term.isDone()));
		pool.shutdown();

		List<String> results;
		results = nda.join();
		System.out.printf("NDA: %d files found.\n", results.size());
		results = travel.join();
		System.out.printf("Travel: %d files found.\n", results.size());
		results = term.join();
		System.out.printf("Term: %d files found.\n", results.size());*/
		
		/************************* Throwing exception in task in fork join **********************/
		/*int array[] = new int[100];
		Task7 task = new Task7(array, 0, 100);
		ForkJoinPool pool = new ForkJoinPool();
		pool.execute(task);
		pool.shutdown();
		try {
			pool.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (task.isCompletedAbnormally()) {
			System.out.printf("Main: An exception has ocurred\n");
			System.out.printf("Main: %s\n", task.getException());
		}
		System.out.printf("Main: Result: %d", task.join());*/

		/************************* Cancelling a task in fork join **********************/
		/*ArrayGenerator generator = new ArrayGenerator();
		int array[] = generator.generateArray(1000);
		TaskManager manager = new TaskManager();

		ForkJoinPool pool = new ForkJoinPool();
		SearchNumberTask task = new SearchNumberTask(array, 0, 1000, 5, manager);
		pool.execute(task);
		pool.shutdown();
		try {
			pool.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("\nMain: The program has finished\n");*/
		
		/************************* Concurrent Linked Deque **********************/
		/*ConcurrentLinkedDeque<String> list = new ConcurrentLinkedDeque<>();
		Thread threads[] = new Thread[100];

		for (int i = 0; i < threads.length; i++) {
			AddTask task = new AddTask(list);
			threads[i] = new Thread(task);
			threads[i].start();
		}
		System.out.printf("Main: %d AddTask threads have been launched\n", threads.length);

		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("Main: Size of the List: %d\n", list.size());

		for (int i = 0; i < threads.length; i++) {
			PollTask task = new PollTask(list);
			threads[i] = new Thread(task);
			threads[i].start();
		}
		System.out.printf("Main: %d PollTask threads have been launched\n", threads.length);
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("Main: Size of the List: %d\n", list.size());*/
		
		/************************* Linked Blocking Deque **********************/
		/*LinkedBlockingDeque<String> list = new LinkedBlockingDeque<>(3);
		Client client = new Client(list);
		Thread thread = new Thread(client);
		thread.start();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				String request = list.take();
				System.out.printf("Main: Request: %s at %s. Size: %d\n", request, new Date(), list.size());
			}
			TimeUnit.MILLISECONDS.sleep(300);
		}
		System.out.printf("Main: End of the program.\n");*/
		
		/************************* Delayed Queue **********************/
		/*DelayQueue<Event1> queue = new DelayQueue<>();
		Thread threads[] = new Thread[5];

		for (int i = 0; i < threads.length; i++) {
			Task9 task = new Task9(i + 1, queue);
			threads[i] = new Thread(task);
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
		}

		do {
			int counter = 0;
			Event1 event;
			do {
				event = queue.poll();
				if (event != null)
					counter++;
			} while (event != null);
			System.out.printf("At %s you have read %d events\n", new Date(), counter);
			TimeUnit.MILLISECONDS.sleep(500);
		} while (queue.size() > 0);*/
		
		/************************* ConcurrentSkipListMap **********************/
		/*ConcurrentSkipListMap<String, Contact> map = map = new ConcurrentSkipListMap<>();
		Thread threads[] = new Thread[25];
		int counter = 0;

		for (char i = 'A'; i < 'Z'; i++) {
			Task10 task = new Task10(map, String.valueOf(i));
			threads[counter] = new Thread(task);
			threads[counter].start();
			counter++;
		}

		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("Main: Size of the map: %d\n", map.size());
		Map.Entry<String, Contact> element;
		Contact contact;

		element = map.firstEntry();
		contact = element.getValue();
		System.out.printf("Main: First Entry: %s: %s\n", contact.getName(), contact.getPhone());

		element = map.lastEntry();
		contact = element.getValue();
		System.out.printf("Main: Last Entry: %s: %s\n", contact.getName(), contact.getPhone());

		System.out.printf("Main: Submap from A1996 to B1002: \n");
		ConcurrentNavigableMap<String, Contact> subMap = map.subMap("A1995", "B1002");

		do {
			element = subMap.pollFirstEntry();
			if (element != null) {
				contact = element.getValue();
				System.out.printf("%s: %s\n", contact.getName(), contact.getPhone());
			}
		} while (element != null);*/
		
		/************************* Using AtomicLong **********************/
		/*Account1 account = new Account1();
		account.setBalance(1000);
		Company1 company = new Company1(account);
		Thread companyThread = new Thread(company);
		Bank1 bank = new Bank1(account);
		Thread bankThread = new Thread(bank);
		System.out.printf("Account : Initial Balance: %d\n", account.getBalance());
		companyThread.start();
		bankThread.start();

		try {
			companyThread.join();
			bankThread.join();
			System.out.printf("Account : Final Balance: %d\n", account.getBalance());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		/************************* Using AtomicIntegerArray **********************/
		/*final int THREADS = 100;
		AtomicIntegerArray vector = new AtomicIntegerArray(1000);

		Incrementer incrementer = new Incrementer(vector);
		Decrementer decrementer = new Decrementer(vector);

		Thread threadIncrementer[] = new Thread[THREADS];
		Thread threadDecrementer[] = new Thread[THREADS];

		for (int i = 0; i < THREADS; i++) {
			threadIncrementer[i] = new Thread(incrementer);
			threadDecrementer[i] = new Thread(decrementer);

			threadIncrementer[i].start();
			threadDecrementer[i].start();
		}

		for (int i = 0; i < 100; i++) {
			try {
				threadIncrementer[i].join();
				threadDecrementer[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < vector.length(); i++) {
			if (vector.get(i) != 0) {
				System.out.println("Vector[" + i + "] : " + vector.get(i));
			}
		}
		System.out.println("Main: End of the example");*/
		
		/************************* Customizing ThreadPoolExecutor class **********************/
		/*MyExecutor executor = new MyExecutor(2, 4, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());
		List<Future<String>> results = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			SleepTwoSecondsTask task = new SleepTwoSecondsTask();
			Future<String> result = executor.submit(task);
			results.add(result);
		}

		for (int i = 0; i < 5; i++) {
			try {
				String result = results.get(i).get();
				System.out.printf("Main: Result for Task %d : %s\n", i, result);
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}

		executor.shutdown();

		for (int i = 5; i < 10; i++) {
			try {
				String result = results.get(i).get();
				System.out.printf("Main: Result for Task %d : %s\n", i, result);
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}

		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.printf("Main: End of the program.\n");*/
		
		/************************* Priority based Executor class **********************/
		/*ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 1, TimeUnit.SECONDS,
				new PriorityBlockingQueue<Runnable>());
		for (int i = 0; i < 4; i++) {
			MyPriorityTask task = new MyPriorityTask("Task " + i, i);
			executor.execute(task);
		}

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 4; i < 8; i++) {
			MyPriorityTask task = new MyPriorityTask("Task " + i, i);
			executor.execute(task);
		}

		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Main: End of the program.\n");*/
		
		/************************* Priority based Executor class **********************/
		/*MyThreadFactory myFactory=new MyThreadFactory("MyThreadFactory");
		MyTask task = new MyTask();
		Thread thread = myFactory.newThread(task);
		thread.start();
		thread.join();
		System.out.printf("Main: Thread information.\n");
		System.out.printf("%s\n",thread);
		System.out.printf("Main: End of the example.\n");*/
		
		/************************* Using ThreadFactory in executor framework **********************/
		/*MyThreadFactory1 threadFactory = new MyThreadFactory1("myThreadFactory");
		ExecutorService executor=Executors.newCachedThreadPool(threadFactory);
		
		MyTask task=new MyTask();
		executor.submit(task);
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.DAYS);
		System.out.printf("Main: End of the program.\n");*/
		
		/************************* Customizing task in scheduled thread pool **********************/
		/*MyScheduledThreadPoolExecutor executor = new MyScheduledThreadPoolExecutor(2);
		Task11 task = new Task11();
		System.out.printf("Main: %s\n", new Date());
		executor.schedule(task, 1, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(3);
		task = new Task11();
		System.out.printf("Main: %s\n", new Date());
		executor.scheduleAtFixedRate(task, 1, 3, TimeUnit.SECONDS);
		TimeUnit.SECONDS.sleep(10);
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.DAYS);
		System.out.printf("Main: End of the program.\n");*/
		
		/************************* Implementing the ThreadFactory interface to generate custom threads for the Fork/Join framework**********************/
		/*MyWorkerThreadFactory factory = new MyWorkerThreadFactory();
		ForkJoinPool pool = new ForkJoinPool(4, factory, null, false);
		int array[] = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = 1;
		}
		MyRecursiveTask task = new MyRecursiveTask(array, 0, array.length);
		pool.execute(task);
		task.join();
		pool.shutdown();
		pool.awaitTermination(1, TimeUnit.DAYS);
		System.out.printf("Main: Result: %d\n", task.get());
		System.out.printf("Main: End of the program\n");*/
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
