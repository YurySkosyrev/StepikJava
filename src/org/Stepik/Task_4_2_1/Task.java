package org.Stepik.Task_4_2_1;

public class Task {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int i = 3;
        while (i > 0){
            try{
                RobotConnection rc = robotConnectionManager.getConnection();
                rc.moveRobotTo(toX, toY);
                rc.close();
                i = 0;
            }
            catch(RobotConnectionException e){
                if (i == 1) throw new  RobotConnectionException("error");
                i-- ;
            }
        }

    }
