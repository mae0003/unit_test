package testcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EasyMethods {
    
    /**
     * int で100を返します。
     * @return 100
     */
    public int get100() {
        return 100;
    }
    
    /**
     * 名前を性と名前の配列で返します。
     */
    public List<String> getMaedaName() {
        return Arrays.asList("Maeda","Hiroyuki");
    }
    
    /**
     * Integerのリストから100以上の要素を抽出します。
     */
    public List<Integer> createThreeNumbersGreaterThan100(List<Integer> values) {
        return values.stream().filter(item -> item >= 100).collect(Collectors.toList()); 
    }
    
    /**
     * 名前と点数からなるMapから点数が55点以上の要素を返します。
     */
    public Map<String,Integer> getGreaterThanAverage(Map<String,Integer> resultMap) {
        return resultMap.entrySet().stream()
            .filter(item -> item.getValue() > 55)
            .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
    }

}
