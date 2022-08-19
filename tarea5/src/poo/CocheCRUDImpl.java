package poo;

public class CocheCRUDImpl implements CocheCRUD{
  @Override
  public void save() {
    getMethodName();
  }

  @Override
  public void findAll() {
    getMethodName();
  }

  @Override
  public void delete() {
    getMethodName();
  }

  private static void getMethodName() {
    if (Thread.currentThread().getStackTrace().length>2) {
      System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
    } else {
      System.out.println("undefined");
    }
  }
}
