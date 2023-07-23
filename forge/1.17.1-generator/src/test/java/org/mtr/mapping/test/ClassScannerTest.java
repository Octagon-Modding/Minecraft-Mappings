package org.mtr.mapping.test;

import com.mojang.math.Vector3f;
import net.minecraft.ChatFormatting;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.resources.sounds.AbstractSoundInstance;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.client.resources.sounds.TickableSoundInstance;
import net.minecraft.client.sounds.SoundManager;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.core.Vec3i;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.util.Mth;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.chunk.ChunkSource;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.scores.Score;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import org.junit.jupiter.api.Test;

import java.util.Random;

public final class ClassScannerTest {

	@Test
	public void scan() {
		final ClassScannerBase scanner = ClassScannerBase.getInstance();
		scanner.put("ActionResult", InteractionResult.class);
		scanner.put("Axis", Direction.Axis.class);
		scanner.put("BlockEntityRendererArgument", BlockEntityRendererProvider.Context.class);
		scanner.put("BlockEntityType", BlockEntityType.class);
		scanner.put("BlockHitResult", BlockHitResult.class);
		scanner.put("BlockPos", BlockPos.class);
		scanner.put("BlockRenderView", BlockAndTintGetter.class);
		scanner.put("BlockSettings", BlockBehaviour.Properties.class);
		scanner.put("BlockState", BlockState.class);
		scanner.put("BlockView", BlockGetter.class);
		scanner.put("BooleanProperty", BooleanProperty.class);
		scanner.put("Box", AABB.class);
		scanner.put("ChunkManager", ChunkSource.class);
		scanner.put("ClientPlayerEntity", LocalPlayer.class);
		scanner.put("ClientWorld", ClientLevel.class);
		scanner.put("CompoundTag", CompoundTag.class);
		scanner.put("Direction", Direction.class);
		scanner.put("DirectionProperty", DirectionProperty.class);
		scanner.put("EntityType", EntityType.class);
		scanner.put("EnumProperty", EnumProperty.class);
		scanner.put("Explosion", Explosion.class);
		scanner.put("FluidState", FluidState.class);
		scanner.put("Hand", InteractionHand.class);
		scanner.put("HeightMapType", Heightmap.Types.class);
		scanner.put("Identifier", ResourceLocation.class);
		scanner.put("IntegerProperty", IntegerProperty.class);
		scanner.put("ItemConvertible", ItemLike.class);
		scanner.put("ItemPlacementContext", BlockPlaceContext.class);
		scanner.put("ItemSettings", Item.Properties.class);
		scanner.put("ItemStack", ItemStack.class);
		scanner.put("ItemUsageContext", UseOnContext.class);
		scanner.put("KeyBinding", KeyMapping.class);
		scanner.put("LivingEntity", LivingEntity.class);
		scanner.put("MathHelper", Mth.class);
		scanner.put("MinecraftClient", Minecraft.class, "ask", "askEither");
		scanner.put("MinecraftServer", MinecraftServer.class, "ask", "askEither");
		scanner.put("Mirror", Mirror.class);
		scanner.put("MutableText", MutableComponent.class);
		scanner.put("OrderedText", FormattedCharSequence.class);
		scanner.put("PacketBuffer", FriendlyByteBuf.class, "readRegistryIdSafe");
		scanner.put("PlayerEntity", Player.class);
		scanner.put("Position", Position.class);
		scanner.put("Property", Property.class);
		scanner.put("Random", Random.class);
		scanner.put("RenderLayer", RenderType.class);
		scanner.put("Rotation", Rotation.class);
		scanner.put("Scoreboard", Scoreboard.class);
		scanner.put("ScoreboardCriterion", ObjectiveCriteria.class);
		scanner.put("ScoreboardCriterionRenderType", ObjectiveCriteria.RenderType.class);
		scanner.put("ScoreboardObjective", Objective.class);
		scanner.put("ScoreboardPlayerScore", Score.class);
		scanner.put("ServerPlayerEntity", ServerPlayer.class);
		scanner.put("ServerWorld", ServerLevel.class);
		scanner.put("ServerWorldAccess", ServerLevelAccessor.class);
		scanner.put("ShapeContext", CollisionContext.class);
		scanner.put("SoundCategory", SoundSource.class);
		scanner.put("SoundEvent", SoundEvent.class);
		scanner.put("SoundInstance", SoundInstance.class);
		scanner.put("SoundManager", SoundManager.class);
		scanner.put("Team", PlayerTeam.class);
		scanner.put("Text", Component.class);
		scanner.put("TextFormatting", ChatFormatting.class);
		scanner.put("TooltipContext", TooltipFlag.class);
		scanner.put("Vector3d", Vec3.class);
		scanner.put("Vector3f", Vector3f.class);
		scanner.put("Vector3i", Vec3i.class);
		scanner.put("VoxelShape", VoxelShape.class);
		scanner.put("VoxelShapes", Shapes.class);
		scanner.put("World", Level.class);
		scanner.put("WorldAccess", LevelAccessor.class);
		scanner.put("WorldChunk", LevelChunk.class);
		scanner.putAbstract("AbstractSoundInstance", AbstractSoundInstance.class);
		scanner.putAbstract("Block", Block.class);
		scanner.putAbstract("BlockEntity", BlockEntity.class);
		scanner.putAbstract("BlockItem", BlockItem.class);
		scanner.putAbstract("Entity", Entity.class);
		scanner.putAbstract("Item", Item.class);
		scanner.putAbstract("MovingSoundInstance", AbstractTickableSoundInstance.class);
		scanner.putAbstract("PlaceableOnWaterItem", WaterLilyBlockItem.class);
		scanner.putAbstract("SlabBlock", SlabBlock.class);
		scanner.putInterface("BlockColorProvider", BlockColor.class);
		scanner.putInterface("ItemColorProvider", ItemColor.class);
		scanner.putInterface("StringIdentifiable", StringRepresentable.class);
		scanner.putInterface("TickableSoundInstance", TickableSoundInstance.class);
		scanner.generate();
	}
}
