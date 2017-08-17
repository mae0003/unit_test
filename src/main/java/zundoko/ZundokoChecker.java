package zundoko;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class ZundokoChecker {
	
	public void zundoko() {
        final List<String> zundoko = Arrays.asList("ズン", "ドコ");
        Random rand = new Random();
        Queue<String> queue = new ArrayBlockingQueue<>(5);
        
        while(true) {
        	String phrase = zundoko.get(rand.nextInt(2));
        	if (!queue.offer(phrase)) {
        		queue.remove();
        		queue.add(phrase);
        	}
        	
        	StringBuilder builder = new StringBuilder();
        	queue.forEach(item -> builder.append(item));
        	
        	System.out.println(builder.toString());
        	if (builder.toString().equals("ズンズンズンズンドコ")) break;
        }
        System.out.println("キ・ヨ・シ❕");
	}
}
