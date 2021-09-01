# 액티비티(Activity) 
- 안드로이드에서 액티비티는 UI가 있는 화면을 사용자에게 제공하는 앱 컴포먼트이다. 즉 화면을 제공하는 기본 단위이다. 
- 안드로이드 애플리케이션은 하나이상의 액티비티로 구성된다. 보통 앱은 하나이상의 액티비티가 서로 연결된 형태로 구성된다.
  -  카카오톡을 실행하면 카카오톡 메인 화면이 뜨면서 바로 이 전에 사용했던 채팅 화면으로 이동한다. 즉 카카오톡에 화면과 이 전에 사용했던 채팅화면은 각각의 액티비티이다.
- 액티비티는 생명주기를 갖는다.
  - 카카오톡을 사용했을 하다가 다른 앱으로 이동할 때 카카오톡 화면은 보이지 않게 되고 다른 앱 화면이 보이게 된다. 즉 액티비티는 각자의 생명주기에 따라 함수가 호출된다.
- 프로그램을 실행하면 기본적으로 MainActivity가 주어진다.


 #  MainActivity 코드 분석
 
  ![image](https://user-images.githubusercontent.com/84066249/131618845-525903a7-2bbb-4c8e-95cf-b8f386f6fb86.png)
              
1. Activity : 해당 안드로이드 버전에 기본 라이브러리 액티비티 클래스이면 그 외의 모든 액티비티 클래스는 이 액티비티 클래스에 하위 클래스가 된다. 

2. AppCompatActivity : 과거 안드로이드 버전의 호환성을 유지하기 위하면서 새로운 안드로이드 버전에 기능을 사용하기 위해 만들어진 클래스이다. 

4. setContentView(R.layout.activity_main) :  setContentView는 레이아웃.xml의 내용을 파싱 하여 뷰를 생성하고 뷰의 정의된 속성을 설정한다. 
  - R : res 폴더
  - layout : R의 내부 클래스
  - activity_main : activity의 activity_main
 R.layout.activity_main는 activity_main.xml을 가리키는 ID이다. 


# Activity  분석


3. onCreate() : 이 메서드는 콜백 메서드이다. 생명 주기에 생성될 때 단 한 번 실행되는 메서드이다. onCreate() 메서드의 매개변수는 savedInstanceState 변수를 가지는데 Bundle 객체로 받는다. 그 이유는 이전 저장된 정보를 받기 위해서다. 처음 생성된 액티비티일 경우 Bundle 객체는 null 값을 갖는다. (Bundle은 여러 가지 타입의 값을 저장하는 Map 클래스이다.)
 ** super.onCreate(savedInstanceState)는 액티비티를 구현하는데 필요한 과정이다. **

5. onStart() : 예외 없이 onCreate가 호출되면 onStart가 호출된다. onStart는 백그라운드가 아닌 포그라운드로 사용자와 상호작용하는 단계이다. (사용자와 상호작용은 불가능한 단계)            onStart 이후에 onResume 상태로 전환된다.

6. onResume : 사용자와 상호작용하는 단계이며 액티비티가 액티비티 스택에 top에 위치한다. (스택 top 위치에 액티비티가 현재 화면에 보이는 액티비티이다.)

7. onPause : 사용자가 시스템을 종료했다는 첫 번째 신호로 onPause() 메서드를 호출한다. 액티비티가 포그라운드에 있지 않고 백그라운드에 있게 된다. onPause() 메서드가 호출된 후 onStart() 메서드 혹은 onReStart() 메서드가 호출된다. 

9. onRestart() : 정지됐던 액티비티가 재시작하는 단계이다. onRestart 뒤에는 onStart가 바로 호출된다.

9. onStop() : 액티비티가 사용자에게 더 이상 표시되지 않고 완전히 종료되었을 때 onStop() 메서드를 호출한다. onStop() 메서드가 호출되면 onReStart 혹은 onDestroy 상태로 전환된다.

11. onDestroy() : 액티비티가 완전히 소멸되기 전에 호출된다. onDestroy()는 사용자가 시스템을 완전히 종료해서 finish()를 호출했거나 시스템이 일시적으로 호출될 때 실행된다.
    (프로그램이 종료될 때 onDestroy가 항상 실행되는 것은 아니다.) 


  

 
 
 
