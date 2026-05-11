
public class Runner {
    public static void main(String[] args) {

        OnlineMeetingTool meeting = new ZoomApp();
        meeting.startMeeting();
        meeting.endMeeting();
        meeting.screenShare();
        meeting.chat();
        OnlineMeetingTool.info();

        System.out.println("-------------");


        EmailService email = new GmailApp();
        email.sendEmail();
        email.receiveEmail();
        email.archive();
        email.spamFilter();
        EmailService.info();

        System.out.println("-------------");


        CloudStorage cloud = new GoogleDrive();
        cloud.uploadFile();
        cloud.downloadFile();
        cloud.sync();
        cloud.backup();
        CloudStorage.info();

        System.out.println("-------------");


        VideoStreamingService video = new YouTubeApp();
        video.playVideo();
        video.stopVideo();
        video.subtitles();
        video.qualityAdjust();
        VideoStreamingService.info();

        System.out.println("-------------");


        ChatApplication chat = new WhatsApp();
        chat.sendMessage();
        chat.receiveMessage();
        chat.deleteMessage();
        chat.muteChat();
        ChatApplication.info();

        System.out.println("-------------");


        PaymentGateway payment = new Paytm();
        payment.pay();
        payment.refund();
        payment.transactionHistory();
        payment.verifyPayment();
        PaymentGateway.info();

        System.out.println("-------------");


        SocialMediaPlatform social = new Instagram();
        social.createPost();
        social.deletePost();
        social.likePost();
        social.comment();
        SocialMediaPlatform.info();

        System.out.println("-------------");


        MusicStreamingService music = new Spotify();
        music.playSong();
        music.pauseSong();
        music.addToPlaylist();
        music.shuffle();
        MusicStreamingService.info();

        System.out.println("-------------");


        OnlineLearningPlatform learn = new Udemy();
        learn.enrollCourse();
        learn.completeCourse();
        learn.quiz();
        learn.certificate();
        OnlineLearningPlatform.info();

        System.out.println("-------------");


        RideBookingApp ride = new OlaApp();
        ride.bookRide();
        ride.cancelRide();
        ride.trackRide();
        ride.estimateFare();
        RideBookingApp.info();
    }
}