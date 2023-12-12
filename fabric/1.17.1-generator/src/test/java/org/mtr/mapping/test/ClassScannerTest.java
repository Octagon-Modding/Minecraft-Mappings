package org.mtr.mapping.test;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.enums.SlabType;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.*;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.sound.*;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.client.util.Window;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.command.DataCommandStorage;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.BossBarManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.fluid.FluidState;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceManager;
import net.minecraft.scoreboard.*;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.PlayerManager;
import net.minecraft.server.function.CommandFunctionManager;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.*;
import net.minecraft.text.MutableText;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.*;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.*;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.chunk.ChunkManager;
import net.minecraft.world.chunk.WorldChunk;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.explosion.Explosion;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import org.junit.jupiter.api.Test;

import java.util.Random;

public final class ClassScannerTest {

	@Test
	public void scan() {
		final ClassScannerBase scanner = ClassScannerBase.getInstance();
		scanner.put("AbstractTexture", AbstractTexture.class);
		scanner.put("ActionResult", ActionResult.class);
		scanner.put("Axis", Direction.Axis.class);
		scanner.put("Biome", Biome.class);
		scanner.put("BiomeSource", BiomeSource.class);
		scanner.put("BlockEntityType", BlockEntityType.class);
		scanner.put("BlockHitResult", BlockHitResult.class);
		scanner.put("BlockPos", BlockPos.class);
		scanner.put("BlockRenderType", BlockRenderType.class);
		scanner.put("BlockRenderView", BlockRenderView.class);
		scanner.put("BlockRotation", BlockRotation.class);
		scanner.put("Blocks", Blocks.class);
		scanner.put("BlockSettings", AbstractBlock.Settings.class);
		scanner.put("BlockState", BlockState.class);
		scanner.put("BlockView", BlockView.class);
		scanner.put("BooleanBiFunction", BooleanBiFunction.class);
		scanner.put("BooleanProperty", BooleanProperty.class);
		scanner.put("BossBarManager", BossBarManager.class);
		scanner.put("Box", Box.class);
		scanner.put("BufferBuilder", BufferBuilder.class);
		scanner.put("BufferBuilderStorage", BufferBuilderStorage.class);
		scanner.put("Camera", Camera.class);
		scanner.put("ChunkGenerator", ChunkGenerator.class);
		scanner.put("ChunkManager", ChunkManager.class);
		scanner.put("ClientPlayerEntity", ClientPlayerEntity.class, "getType");
		scanner.put("ClientPlayNetworkHandler", ClientPlayNetworkHandler.class);
		scanner.put("ClientWorld", ClientWorld.class);
		scanner.put("CommandFunctionManager", CommandFunctionManager.class);
		scanner.put("CompoundTag", NbtCompound.class);
		scanner.put("DataCommandStorage", DataCommandStorage.class);
		scanner.put("Difficulty", Difficulty.class);
		scanner.put("DimensionOptions", DimensionOptions.class);
		scanner.put("DimensionType", DimensionType.class);
		scanner.put("Direction", Direction.class);
		scanner.put("DirectionProperty", DirectionProperty.class);
		scanner.put("EntityPose", EntityPose.class);
		scanner.put("EntityRenderDispatcher", EntityRenderDispatcher.class);
		scanner.put("EntityType", EntityType.class);
		scanner.put("EnumProperty", EnumProperty.class);
		scanner.put("Explosion", Explosion.class);
		scanner.put("FluidState", FluidState.class);
		scanner.put("GameMode", GameMode.class);
		scanner.put("GameOptions", GameOptions.class);
		scanner.put("GameRenderer", GameRenderer.class);
		scanner.put("Hand", Hand.class);
		scanner.put("HeightMapType", Heightmap.Type.class);
		scanner.put("HitResult", HitResult.class);
		scanner.put("HitResultType", HitResult.Type.class);
		scanner.put("Identifier", Identifier.class);
		scanner.put("IntegerProperty", IntProperty.class);
		scanner.put("InternalFormat", NativeImage.InternalFormat.class);
		scanner.put("Inventory", Inventory.class);
		scanner.put("ItemConvertible", ItemConvertible.class);
		scanner.put("ItemPlacementContext", ItemPlacementContext.class);
		scanner.put("Items", Items.class);
		scanner.put("ItemSettings", Item.Settings.class);
		scanner.put("ItemStack", ItemStack.class);
		scanner.put("ItemUsageContext", ItemUsageContext.class);
		scanner.put("KeyBinding", KeyBinding.class);
		scanner.put("LightmapTextureManager", LightmapTextureManager.class);
		scanner.put("LightType", LightType.class);
		scanner.put("LivingEntity", LivingEntity.class, "getType");
		scanner.put("MapColor", MapColor.class);
		scanner.put("MathHelper", MathHelper.class, "MathHelper");
		scanner.put("Matrix3f", Matrix3f.class);
		scanner.put("Matrix4f", Matrix4f.class);
		scanner.put("MinecraftClient", MinecraftClient.class, "ask", "askFallible");
		scanner.put("MinecraftServer", MinecraftServer.class, "ask", "askFallible");
		scanner.put("Mirror", BlockMirror.class);
		scanner.put("ModelPart", ModelPart.class);
		scanner.put("MutableText", MutableText.class);
		scanner.put("NativeImage", NativeImage.class);
		scanner.put("NativeImageBackedTexture", NativeImageBackedTexture.class);
		scanner.put("NativeImageFormat", NativeImage.Format.class);
		scanner.put("OperatingSystem", Util.OperatingSystem.class);
		scanner.put("OrderedText", OrderedText.class);
		scanner.put("OverlayTexture", OverlayTexture.class);
		scanner.put("PacketBuffer", PacketByteBuf.class);
		scanner.put("PlayerEntity", PlayerEntity.class, "getType");
		scanner.put("PlayerInventory", PlayerInventory.class);
		scanner.put("PlayerListEntry", PlayerListEntry.class);
		scanner.put("PlayerManager", PlayerManager.class);
		scanner.put("Position", Position.class);
		scanner.put("Property", Property.class);
		scanner.put("Random", Random.class);
		scanner.put("RenderLayer", RenderLayer.class);
		scanner.put("Resource", Resource.class);
		scanner.put("ResourceManager", ResourceManager.class);
		scanner.put("SaveProperties", SaveProperties.class);
		scanner.put("Scoreboard", Scoreboard.class);
		scanner.put("ScoreboardCriterion", ScoreboardCriterion.class);
		scanner.put("ScoreboardCriterionRenderType", ScoreboardCriterion.RenderType.class);
		scanner.put("ScoreboardObjective", ScoreboardObjective.class);
		scanner.put("ScoreboardScore", ScoreboardPlayerScore.class);
		scanner.put("ServerPlayerEntity", ServerPlayerEntity.class, "getType");
		scanner.put("ServerWorld", ServerWorld.class);
		scanner.put("ServerWorldAccess", ServerWorldAccess.class);
		scanner.put("ShapeContext", ShapeContext.class);
		scanner.put("SlabType", SlabType.class);
		scanner.put("SoundCategory", SoundCategory.class);
		scanner.put("SoundEvent", SoundEvent.class);
		scanner.put("SoundEvents", SoundEvents.class);
		scanner.put("SoundInstance", SoundInstance.class);
		scanner.put("SoundManager", SoundManager.class);
		scanner.put("Style", Style.class);
		scanner.put("Team", Team.class);
		scanner.put("Tessellator", Tessellator.class);
		scanner.put("Text", Text.class);
		scanner.put("TextFormatting", Formatting.class);
		scanner.put("TextRenderer", TextRenderer.class);
		scanner.put("TextureManager", TextureManager.class);
		scanner.put("TooltipContext", TooltipContext.class);
		scanner.put("Util", Util.class);
		scanner.put("Vector3d", Vec3d.class);
		scanner.put("Vector3f", Vec3f.class);
		scanner.put("Vector3i", Vec3i.class);
		scanner.put("VertexFormat", VertexFormat.class);
		scanner.put("VertexFormatElement", VertexFormatElement.class);
		scanner.put("VertexFormats", VertexFormats.class, "VertexFormats");
		scanner.put("VoxelShape", VoxelShape.class);
		scanner.put("VoxelShapes", VoxelShapes.class, "VoxelShapes");
		scanner.put("Window", Window.class);
		scanner.put("World", World.class);
		scanner.put("WorldAccess", WorldAccess.class);
		scanner.put("WorldChunk", WorldChunk.class);
		scanner.put("WorldRenderer", WorldRenderer.class);
		scanner.put("WorldSavePath", WorldSavePath.class);
		scanner.putAbstract("AbstractSoundInstance", AbstractSoundInstance.class);
		scanner.putAbstract("Block", Block.class);
		scanner.putAbstract("BlockEntity", BlockEntity.class, "getType");
		scanner.putAbstract("BlockItem", BlockItem.class);
		scanner.putAbstract("ButtonWidget", ButtonWidget.class);
		scanner.putAbstract("CheckboxWidget", CheckboxWidget.class);
		scanner.putAbstract("ClickableWidget", ClickableWidget.class);
		scanner.putAbstract("Entity", Entity.class, "getType");
		scanner.putAbstract("EntityModel", EntityModel.class);
		scanner.putAbstract("Item", Item.class);
		scanner.putAbstract("Model", Model.class);
		scanner.putAbstract("MovingSoundInstance", MovingSoundInstance.class);
		scanner.putAbstract("PersistentState", PersistentState.class);
		scanner.putAbstract("PlaceableOnWaterItem", LilyPadItem.class);
		scanner.putAbstract("PressableWidget", PressableWidget.class);
		scanner.putAbstract("Screen", Screen.class);
		scanner.putAbstract("SlabBlock", SlabBlock.class);
		scanner.putAbstract("SliderWidget", SliderWidget.class);
		scanner.putAbstract("TextFieldWidget", TextFieldWidget.class);
		scanner.putAbstract("TexturedButtonWidget", TexturedButtonWidget.class);
		scanner.putAbstract("ToggleButtonWidget", ToggleButtonWidget.class);
		scanner.putInterface("BlockColorProvider", BlockColorProvider.class);
		scanner.putInterface("ItemColorProvider", ItemColorProvider.class);
		scanner.putInterface("PressAction", ButtonWidget.PressAction.class);
		scanner.putInterface("StringIdentifiable", StringIdentifiable.class);
		scanner.putInterface("TickableSoundInstance", TickableSoundInstance.class);
		scanner.generate();
	}
}
