package hello.core.singletone;

public class SingletoneService {

    //static의 영역에 대해 공부....
    //자신을 private하게 생성하고 instace에 참조
    private static final SingletoneService instance = new SingletoneService();

    
    // 조회
    // instance가 필요하면 오직 getInstace를 통해서만 참조가능하다
    public static SingletoneService getInstance() {
        return instance;
    }

    //다른 클래스에서 사용할 수 없게 private한다
    private SingletoneService() {
        
    }
    
    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
    
}
