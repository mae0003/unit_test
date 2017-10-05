package testcode;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class ReadResources {

    public void readYaml() {
        InputStream ios = this.getClass().getResourceAsStream("test.yaml");
        Yaml yaml = new Yaml();
        // YAMLから読み込んだドキュメント情報
        List<Map<String, String>> documentInfos = (List<Map<String, String>>) yaml.load(ios);
        documentInfos.forEach( map -> System.err.println(map));
    }
    
    public static void main(String... args) {
        new ReadResources().readYaml();
    }
}
