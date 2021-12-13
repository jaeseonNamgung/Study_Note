# 암호화와 복호화(base64)

1. 자바 스크립트
```js
<script src = "https://cdnjs.cloudflare.com/ajax/libs/crypto-js/3.1.2/rollups/aes.js"></script>
```
- btoa(문자열) : base64 암호화
- atoa(문자열) : base64 복호화

2. 자바
```java
// base64 암호화
Base64.getEncoder().encodeToString(문자열.getBytes()); 

// base64 복호화
Decoder 변수명 = base64.getDecoder().decode(문자열);
```