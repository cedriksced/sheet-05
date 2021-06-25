package factory.sports;

public class Walking implements Sport {

    protected final Ground ground;
    protected String ascii = """
                        ,
                     ,:' `..;
                     `. ,;;'%
                     +;;'%%%%%
                      /- %,)%%
                      `   \\ %%
                       =  )/ \\
                       `-'/ / \\
                         /\\/.-.\\
                        |  (    |
                        |  |   ||
                        |  |   ||
                    _.-----'   ||
                   / \\________,'|
                  (((/  |       |
                  //    |       |
                 //     |\\      |
                //      | \\     |
               //       |  \\    |
              //        |   \\   |
             //         |    \\  |
            //          |    |\\ |
           //           |    | \\|
          //            \\    \\
         c'             |\\    \\
                        | \\    \\
                        |  \\    \\
                        |.' \\    \\
                       _\\    \\.-' \\
                      (___.-(__.'\\/""";

    public Walking(Ground ground) {
        this.ground = ground;
    }

    @Override
    public void perform() {
        System.out.println("I am walking on " + ground);
        System.out.println(ascii);
    }
}
