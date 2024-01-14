package in.techcamp.firstapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //そのクラスがコントローラーであることを伝えるアノテーション
public class PostController {
    @GetMapping("/hello")   //ブラウザで入力されたURLと実行されるメソッドを紐付けるためのアノテーション
    public String showHello(Model model){  //返り値が文字列（String）のメソッド、Modelオブジェクトの受け取り
        var sampleText = "サンプルテキスト";
        model.addAttribute("sampleText", sampleText);   //addAttributeでmodelにデータを追加している、1つ目のsampleTextはビューで表示する際の名前、2つ目の名前は11行目で指定しているsampleText
        return "hello"; //htmlファイルの指定。.htmlの部分は省略可能
    }
}
