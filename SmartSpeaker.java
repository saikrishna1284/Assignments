public class SmartSpeaker implements MainInterface,FirstInterface,SecondInterface{
    public void musicPlaying(String songname){
        System.out.println(songname+" song is playing");
    }
    public void voiceAssistance(String voicecommand){
        System.out.println(voicecommand+" command is issued");
    }
    public void internetEnabled(String networkname){
        System.out.println(networkname+" network is connected");
    }
    public void videoPlayer(String videoName){
        System.out.println(videoName+" video is playing");
    }
    
}
