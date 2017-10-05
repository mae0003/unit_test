package zundoko;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

import testcode.ConstData;

/**
 * ズンドコチェッカー 
 * @see 
 */
public class ZundokoChecker {
	
    Queue<String> queue = new ArrayBlockingQueue<>(ConstData.FIVE);

    public String zundoko(String phrase) {

        if (!queue.offer(phrase)) {
            queue.remove();
            queue.add(phrase);
        }

        StringBuilder builder = new StringBuilder();
        queue.forEach(item -> builder.append(item));

        if (builder.toString().equals("ズンズンズンズンドコ")) {
            return "キヨシ";
        }

        return null;
    }
}
