package org.mtr.mapping.mapper;

import org.mtr.mapping.annotation.MappedMethod;
import org.mtr.mapping.holder.*;

import java.util.function.Consumer;

public abstract class AbstractSoundInstanceExtension extends AbstractSoundInstanceAbstractMapping {

	@MappedMethod
	protected void setIsRelativeMapped(boolean isRelative) {
		looping = isRelative;
	}

	@MappedMethod
	protected void setIsRepeatableMapped(boolean isRepeatable) {
		repeat = isRepeatable;
	}

	@MappedMethod
	public boolean isRelative2() {
		return super.isLooping2();
	}

	@MappedMethod
	@Override
	public boolean isRepeatable2() {
		return super.isRepeatable2();
	}

	@MappedMethod
	protected AbstractSoundInstanceExtension(SoundEvent sound, SoundCategory category) {
		super(sound, category);
	}

	@MappedMethod
	protected AbstractSoundInstanceExtension(Identifier soundId, SoundCategory category) {
		super(soundId, category);
	}

	@MappedMethod
	public static SoundEvent createSoundEvent(Identifier identifier) {
		return new SoundEvent(identifier);
	}

	@MappedMethod
	public static void iterateSoundIds(Consumer<Identifier> consumer) {
		MinecraftClient.getInstance().getSoundManager().getKeys().forEach(identifier -> consumer.accept(new Identifier(identifier)));
	}
}
