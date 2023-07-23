package org.mtr.mapping.test;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.sound.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.scoreboard.*;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.state.property.*;
import net.minecraft.text.MutableText;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.*;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.*;
import net.minecraft.world.chunk.ChunkManager;
import net.minecraft.world.chunk.WorldChunk;
import net.minecraft.world.explosion.Explosion;
import org.junit.jupiter.api.Test;

import java.util.Random;

public final class ClassScannerTest {

	@Test
	public void scan() {
		final ClassScannerBase scanner = ClassScannerBase.getInstance();
		scanner.put("ActionResult", ActionResult.class);
		scanner.put("Axis", Direction.Axis.class);
		scanner.put("BlockEntityRendererArgument", BlockEntityRendererFactory.Context.class);
		scanner.put("BlockEntityType", BlockEntityType.class);
		scanner.put("BlockHitResult", BlockHitResult.class);
		scanner.put("BlockPos", BlockPos.class);
		scanner.put("BlockRenderView", BlockRenderView.class);
		scanner.put("BlockSettings", AbstractBlock.Settings.class);
		scanner.put("BlockState", BlockState.class);
		scanner.put("BlockView", BlockView.class);
		scanner.put("BooleanProperty", BooleanProperty.class);
		scanner.put("Box", Box.class);
		scanner.put("ChunkManager", ChunkManager.class);
		scanner.put("ClientPlayerEntity", ClientPlayerEntity.class);
		scanner.put("ClientWorld", ClientWorld.class);
		scanner.put("CompoundTag", NbtCompound.class);
		scanner.put("Direction", Direction.class);
		scanner.put("DirectionProperty", DirectionProperty.class);
		scanner.put("EntityType", EntityType.class);
		scanner.put("EnumProperty", EnumProperty.class);
		scanner.put("Explosion", Explosion.class);
		scanner.put("FluidState", FluidState.class);
		scanner.put("Hand", Hand.class);
		scanner.put("HeightMapType", Heightmap.Type.class);
		scanner.put("Identifier", Identifier.class);
		scanner.put("IntegerProperty", IntProperty.class);
		scanner.put("ItemConvertible", ItemConvertible.class);
		scanner.put("ItemPlacementContext", ItemPlacementContext.class);
		scanner.put("ItemSettings", Item.Settings.class);
		scanner.put("ItemStack", ItemStack.class);
		scanner.put("ItemUsageContext", ItemUsageContext.class);
		scanner.put("KeyBinding", KeyBinding.class);
		scanner.put("LivingEntity", LivingEntity.class);
		scanner.put("MathHelper", MathHelper.class);
		scanner.put("MinecraftClient", MinecraftClient.class, "ask", "askFallible");
		scanner.put("MinecraftServer", MinecraftServer.class, "ask", "askFallible");
		scanner.put("Mirror", BlockMirror.class);
		scanner.put("MutableText", MutableText.class);
		scanner.put("OrderedText", OrderedText.class);
		scanner.put("PacketBuffer", PacketByteBuf.class);
		scanner.put("PlayerEntity", PlayerEntity.class);
		scanner.put("Position", Position.class);
		scanner.put("Property", Property.class);
		scanner.put("Random", Random.class);
		scanner.put("RenderLayer", RenderLayer.class);
		scanner.put("Rotation", BlockRotation.class);
		scanner.put("Scoreboard", Scoreboard.class);
		scanner.put("ScoreboardCriterion", ScoreboardCriterion.class);
		scanner.put("ScoreboardCriterionRenderType", ScoreboardCriterion.RenderType.class);
		scanner.put("ScoreboardObjective", ScoreboardObjective.class);
		scanner.put("ScoreboardPlayerScore", ScoreboardPlayerScore.class);
		scanner.put("ServerPlayerEntity", ServerPlayerEntity.class);
		scanner.put("ServerWorld", ServerWorld.class);
		scanner.put("ServerWorldAccess", ServerWorldAccess.class);
		scanner.put("ShapeContext", ShapeContext.class);
		scanner.put("SoundCategory", SoundCategory.class);
		scanner.put("SoundEvent", SoundEvent.class);
		scanner.put("SoundInstance", SoundInstance.class);
		scanner.put("SoundManager", SoundManager.class);
		scanner.put("Team", Team.class);
		scanner.put("Text", Text.class);
		scanner.put("TextFormatting", Formatting.class);
		scanner.put("TooltipContext", TooltipContext.class);
		scanner.put("Vector3d", Vec3d.class);
		scanner.put("Vector3f", Vec3f.class);
		scanner.put("Vector3i", Vec3i.class);
		scanner.put("VoxelShape", VoxelShape.class);
		scanner.put("VoxelShapes", VoxelShapes.class);
		scanner.put("World", World.class);
		scanner.put("WorldAccess", WorldAccess.class);
		scanner.put("WorldChunk", WorldChunk.class);
		scanner.putAbstract("AbstractSoundInstance", AbstractSoundInstance.class);
		scanner.putAbstract("Block", Block.class);
		scanner.putAbstract("BlockEntity", BlockEntity.class);
		scanner.putAbstract("BlockItem", BlockItem.class);
		scanner.putAbstract("Entity", Entity.class);
		scanner.putAbstract("Item", Item.class);
		scanner.putAbstract("MovingSoundInstance", MovingSoundInstance.class);
		scanner.putAbstract("PlaceableOnWaterItem", LilyPadItem.class);
		scanner.putAbstract("SlabBlock", SlabBlock.class);
		scanner.putInterface("BlockColorProvider", BlockColorProvider.class);
		scanner.putInterface("ItemColorProvider", ItemColorProvider.class);
		scanner.putInterface("StringIdentifiable", StringIdentifiable.class);
		scanner.putInterface("TickableSoundInstance", TickableSoundInstance.class);
		scanner.generate();
	}
}
