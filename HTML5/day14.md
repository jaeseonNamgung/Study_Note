# 멀티미디어

1. ```<audio>```
  - html5에서 음악이나 오디오 같은 사운드를 재생하기 위해 사용
  - 속성 종류
     - ```src="url"``` : 오디오 파일의 위치를 연결, 명시
     - ```controls``` : 웹 화면에 재생 컨트롤 막대를 표시
     - ```muted``` : 오디오가 재생 중이지만 소리를 끔(음소거 처리)
     - ```loop``` : 오디오를 반복 재생
     - ```autoplay``` : 오디오를 자동 재생(크롬에서는 자체적으로 자동 재생을 제한하고 있으므로 개별성 하지 않을 경우 적용이 되지 않음)
     - ```preload``` : (auto/metadata/none) 재생 버튼을 눌러 재생하기 전 오디오 파일을 다운로드해 준비
  - 오디오 요소 파일 확장자
    - MP3 : Moving Picture Experts Group에 의해 개발, 손실 압축형 파일 형식으로 가장 많이 사용
    - WAV : IBA과 Microsoft에 의해 개발, Microsoft의 표준 오디오 파일 형식
    - Ogg : Xiph 재단에 의해 개발, MP3의 대안으로 개발된 특허권으로 보호되지 않은 개방형 공개 멀티미디어 파일 형식

```html
<body>
    <audio src="file/test_ado.mp3" controls loop></audio> 
    <!--controls를 사용해 컨트롤 막대를 화면에 표시하고 loop를 사용해 오디오를 반복 재생한다.-->
</body>

```
![image](https://user-images.githubusercontent.com/84066249/135209419-a8047800-7142-43f2-86e0-7045798ea304.png)


2. ```<video>```
  - html5에서 영상을 실행하기 위해 사용
  - 속성 종류
    - ```src="url"``` :  비디오 파일의 위치를 연결, 명시
    - ```controls``` : 웹 화면에 재생 컨트롤 막대를 표시
    - ```muted``` : 비디오가 재생 중이지만 소리를 끔(음소거 처리)
    - ```loop``` : 비디오를 반복 재생
    - ```autoplay``` : 비디오를 자동 재생(크롬에서는 자체적으로 자동 재생을 제한하고 있으므로 개별성하지 않을 경우 적용이 되지 않음)
    - ```preload``` : (auto/metadata/none) 재생 버튼을 눌러 재생하기 전 비디오 파일을 다운로드해 준비  
    - ```poster="url"``` : 파일을 다운로드 중 사용자가 보이게 될 이미지를 명시
    - ```width=" "``` : 비디오 화면의 넓이 지정
    - ```height=" "``` : 비디오 화면의 높이 지정
  - 오디오 요소 파일 확장자
    - MP4 (MIME 타입: video / mp4)
    - WebM (MIME 타입: video / webm)
    - Ogg (MIME 타입: video / ogg)
  
  ```html
  <body>
   <video src="file/korea_video.mp4" width="400" height="200" controls muted></video>
   <!-- width와 height를 사용해 넓이와 높이를 지정하고 controls를 사용해 컨트롤 막대를 화면에 표시하고 muted를 상용해 영상은 재생되나 음소거 시킨다. -->
</body>
  ```
 ![image](https://user-images.githubusercontent.com/84066249/135213903-cbf431f8-aff7-44cf-8bc0-37bf2ded31be.png)

3. ```<iframe>```
 - HTML 문서에 다른 문서를 포함시킬 때 사용 -> 웹 문서 안에 다른 외부 문서를 불러올 때 사용, 상황에 따라 유튜브와 같은 영상 링크나 많은 양의 콘텐츠 정보를 불러올 때 사용
 - 속성 종류  
  - ```width``` : 넓이를 지정할 때 사용(%, px)
  - ```height``` : 높이를 지정할 때 사용(% px)
  - ```name``` : 현재 iframe의 이름
  - ```src``` : iframe에 표시할 문서의 주소를 지정
  
  ```html
<body>
    <iframe width="894" height="503" src="https://www.youtube.com/embed/Xc1Le3CSdrM" title="YouTube video player" frameborder="0" 
    allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
   <!-- 유튜브 영상을 화면상에 보이게 하는 법 >> 유튜브 영상을 클릭한 후 유튜브 영상의 마우스를 올려놓고 우 클릭 한 다음 소스코드 복사 후 <body> 태그 안에 
        붙여넣기 하면 된다.-->
</body>
  ```
 ![image](https://user-images.githubusercontent.com/84066249/135216401-13521b8e-5e09-44c0-b9fa-0b3f25ca73ef.png)
   
