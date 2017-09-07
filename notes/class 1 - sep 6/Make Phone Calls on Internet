Make Phone Call on Internet

Objects and Behaviors:

InternetPhoneService
	Data : name, phoneNumber, emailAddress
	Behavior: connect, speakText, sendVideo, authorize

Caller

	Data: number, name, money
	Behavior: makeCall, speak, endCall, seeTheVideo, listen, purchase, loginToPhoneService


Receiver

	Data: number, name
	Behavior: recieveCall, answer, speak, endCall,seeTheVideo, listen, loggedInToPhoneService
	

Sequence of Flow - Invoke Objects with Behaviors

Caller kevin
Receiver bin;
InternetPhoneService skype;
kevin.loginToPhoneService -> skype : authorize
if( authorize is true )
	
	kevin.connect -> skype, bin : connected
	if connected is true
		Loop
			kevin.talk -> skype, bin, sentence : response
			bin.respond -> skype, kevin, sentence : response
			if kevin.wantsToTurnTheVideo and kevin.videoIsNotTurnedOn and kevin.hasWebCam
				kevin.turnOnVdeo -> skype, bin, stream : video
				bin.seeTheVideo -> skype, video
			end
			if kevin.wantsToEndTheCalls
				kevin.endTheCall -> skype
			end
		
			if bin.wantsToEndTheCall
				bin.endTheCall -> skype
			end
		end
	else
	
	end

else
	kevin.cantMakeCalls
end 
