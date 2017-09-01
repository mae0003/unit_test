package unit_test.rental.data;

import java.util.List;

public interface CsvReader<T> {
    
    /** 
     * CSVファイルを読み込みリストで返します
     */
    public List<T> readCsv(String resourcePath);
}
