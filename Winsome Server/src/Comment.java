
public class Comment{
    private String username;
    private String body;

    public Comment(String user, String body){
        this.username = user;
        this.body = body;
    }

    public Comment(){
        
    }

    public void print(){
        System.out.println("        Username: "+ username);
        System.out.println("        Body: "+ body);
    }

    String getUsername(){
        return username;
    }
    String getBody(){
        return body;
    }
}
