package org.Stepik.Task_4_2_1;

public class Task {
    // решение с ресурсами
    public static void moveRobot1 (RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for(int i = 0; i < 3; i++){
            try(RobotConnection rc = robotConnectionManager.getConnection()){
                rc.moveRobotTo(toX, toY);
                i = 3;
            }
            catch(RobotConnectionException e){
                if (i == 2) throw new  RobotConnectionException("error");
            }
        }
    }

    // решение без ресурсов
    public static void moveRobot2(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for(int i = 0; i < 3; i++){
            try{
                RobotConnection rc = robotConnectionManager.getConnection();
                try {
                    rc.moveRobotTo(toX, toY);
                    i = 3;
                }
                finally{
                    rc.close();
                }
            }
            catch(RobotConnectionException e){
                if (i == 2) throw new  RobotConnectionException("error");
            }
        }
    }

}
