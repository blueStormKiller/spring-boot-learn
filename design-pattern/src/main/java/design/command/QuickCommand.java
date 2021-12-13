package design.command;

/**
 * @author lrt
 * @version 1.0.0
 * @ClassName QuickCommand.java
 * @Description TODO
 * @createTime 2021年12月02日 10:36:00
 */
public class QuickCommand implements Command{

 private Command[] commands;

 public QuickCommand(Command[] commands){
  this.commands=commands;
 }

 @Override
 public void execute(){
  for(int i=0;i<commands.length;i++){
   commands[i].execute();
  }
 }
}
