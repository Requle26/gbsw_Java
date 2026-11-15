package ch06.b;

// 폴더 구조상 b는 ch06의 자식 폴더이지만,
// ch06과 ch06.b는 서로 패키지로 인식딘다.
// 따라서 ch06.b 하위의 클래스에서 ch06의 클래스를 사용하려면
// import가 필요하다

import ch06.ImportTest;


public class ImportTestB {
//    ImportTest;
}
