package scalac.issues;

class JavaContainerWrap implements Wrap<JavaContainer> {
  @Override
  public <A> JavaContainer<A> wrap(A a) {
    return new JavaContainer(a);
  }

}
