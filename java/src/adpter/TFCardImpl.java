package adpter;

public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        String msg = "TFCard read msg : hello world TFCard";
        return null;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg :"+msg);
    }
}
