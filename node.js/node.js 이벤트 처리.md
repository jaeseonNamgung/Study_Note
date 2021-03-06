# node.js 이벤트 처리

- node.js 에서 이벤트 처리는 비동기 방식 서버 프레임워크이다.
- node.js에서 이벤트를 처리하기 위해서는 `EventEmitter` 객체가 필요하다.

1. EventEmitter : node.js의 모든 이벤트 처리가 정의된 기본 객체이다. EventEmitter 객체를 사용하기 위해서는 EventEmitter 객체를 재정의 한 후 사용가능하다.

```javascript
const EventEmitter = require('events');
const emitter = new EventEmitter(); // 재정의
```

2. on / addListener: 이벤트를 연결하는 함수

```javascript
emitter.on('eventname', listener);
// or
emitter.addListener('eventname', listener);
```

3. once: 이벤트를 한번만 열결하는 함수

```javascript
emitter.once('eventname', listener)
```

4. emit : 이벤트를 발생시키는 함수

```javascript
emitter.emit('eventname', '전달하려는 값');
```

5. off / removeAllListeners  : 이벤트에 등록된 모든 리스너들을 제거

```javascript
emitter.off('eventname', listener);
// or
emitter.removeAllListeners('eventname', listener);
```

6. listnerCount : 이벤트가 연결된 리스너의 index를 반환

```javascript
emitter.listnerCount('eventname');
```

