package tv;

public class TV {

	private int channel; // 1~255
	private int volume; // 0~100
	private boolean power;

	public void status() {
		System.out.println("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	void power(boolean on) {
		if (on) {
			this.power = on;
		} else {
			this.power = on;
		}
	}

	void channel(int channel) {
		if (channel <= 0 || channel >= 255) {
			System.out.println("잘못된 채널입니다.");
		} else {
			this.channel = channel;
		}
	}

	void channel(boolean up) {
		if (up) {
			if (channel == 255) {
				channel = 1;
			} else {
				channel += 1;
			}
		} else {
			if (channel == 1) {
				channel = 255;
			} else {
				channel -= 1;
			}
		}
	}

	void volume(int volume) {
		if (volume <= 0 || volume >= 100) {
			System.out.println("벗어난 범위의 볼륨입니다.");
		} else {
			this.volume = volume;
		}
	}
	
	void volume(boolean up) {
		if(up) {
			if(volume==100) {
				
			}else{
				volume+=1;
			}
		}	else {
			if(volume==0) {
				
			} else{
				volume-=1;
			}
		}
	}
	
	void status(int channel, int volume, boolean power) {
		System.out.println("채널 : " + this.channel + " " + "볼륨 : " + this.volume + " " + "TV 상태" + this.power);
	}
}
