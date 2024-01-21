package in.techcamp.firstapp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller //そのクラスがコントローラーであることを伝えるアノテーション
@RequiredArgsConstructor
public class PostController {
    private  final  PostRepository postRepository;
    @GetMapping("/hello")   //ブラウザで入力されたURLと実行されるメソッドを紐付けるためのアノテーション
    public String showHello(Model model){  //返り値が文字列（String）のメソッド、Modelオブジェクトの受け取り
        var sampleText = "サンプルテキスト";
        model.addAttribute("sampleText", sampleText);   //addAttributeでmodelにデータを追加している、1つ目のsampleTextはビューで表示する際の名前、2つ目の名前は11行目で指定しているsampleText
        return "hello"; //htmlファイルの指定。.html部分は省略可能
    }

    @GetMapping
    public String showList(Model model) {
        var postList = postRepository.findAll();
        model.addAttribute("postList", postList);
        return "index";
    }
}
