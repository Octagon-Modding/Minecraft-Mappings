package org.mtr.mapping;

public interface MethodMaps {

	static void setMethodMaps(BuildTools.AddMethodMap1 addMethodMap1, BuildTools.AddMethodMap2 addMethodMap2, BuildTools.Blacklist blacklist) {
		addMethodMap1.add("AbstractTexture|NativeImageBackedTexture", "bindTexture", "bind");
		addMethodMap1.add("AbstractTexture|NativeImageBackedTexture", "clearGlId", "releaseId");
		addMethodMap1.add("Block|SlabBlock", "emitsRedstonePower", "isSignalSource");
		addMethodMap1.add("Block|SlabBlock", "getCameraCollisionShape", "getVisualShape");
		addMethodMap1.add("Block|SlabBlock", "getInteractionShape", "getRaycastShape");
		addMethodMap1.add("Block|SlabBlock", "getOcclusionShape", "getCullingShape");
		addMethodMap1.add("Block|SlabBlock", "getOutlineShape", "getShape");
		addMethodMap1.add("Block|SlabBlock", "getSidesShape", "getBlockSupportShape");
		addMethodMap1.add("Block|SlabBlock", "getStrongRedstonePower", "getDirectSignal");
		addMethodMap1.add("Block|SlabBlock", "getWeakRedstonePower", "getSignal");
		addMethodMap1.add("Block|SlabBlock", "hasComparatorOutput", "hasAnalogOutputSignal");
		addMethodMap1.add("Block|SlabBlock", "hasRandomTicks", "isRandomlyTicking");
		addMethodMap1.add("Block|SlabBlock", "isTranslucent", "isTransparent", "propagatesSkylightDown");
		addMethodMap1.add("Block|SlabBlock", "onPlace", "onBlockAdded");
		addMethodMap1.add("Block|SlabBlock", "onRemove", "onStateReplaced");
		addMethodMap1.add("BlockEntity", "markRemoved", "setRemoved");
		addMethodMap1.add("BlockItem|Item", "hasGlint", "isFoil");
		addMethodMap1.add("BlockItem|Item", "isFood", "isEdible");
		addMethodMap1.add("BlockItem|Item", "isNbtSynced", "shouldOverrideMultiplayerNbt", "shouldSyncTagToClient");
		addMethodMap1.add("BlockItem|Item", "isNetworkSynced", "isComplex");
		addMethodMap1.add("BlockPos", "crossProduct", "cross");
		addMethodMap1.add("BlockPos", "down", "below");
		addMethodMap1.add("BlockPos", "toImmutable", "immutable");
		addMethodMap1.add("BlockPos", "up", "above");
		addMethodMap1.add("BlockSettings", "breakInstantly", "instabreak");
		addMethodMap1.add("BlockSettings", "dropsNothing", "noDrops", "noLootTable");
		addMethodMap1.add("BlockSettings", "dynamicBounds", "dynamicShape");
		addMethodMap1.add("BlockSettings", "jumpVelocityMultiplier", "jumpFactor");
		addMethodMap1.add("BlockSettings", "noCollision", "noCollission");
		addMethodMap1.add("BlockSettings", "nonOpaque", "noOcclusion");
		addMethodMap1.add("BlockSettings", "slipperiness", "friction");
		addMethodMap1.add("BlockSettings", "ticksRandomly", "randomTicks");
		addMethodMap1.add("BlockSettings", "velocityMultiplier", "speedFactor");
		addMethodMap1.add("BlockState", "with", "setValue");
		addMethodMap1.add("Camera", "getPitch", "getXRot");
		addMethodMap1.add("Camera", "getYaw", "getYRot");
		addMethodMap1.add("Camera", "isReady", "isInitialized");
		addMethodMap1.add("Camera", "isThirdPerson", "isDetached");
		addMethodMap1.add("CheckboxWidget", "isChecked", "selected");
		addMethodMap1.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "addScoreboardTag", "addCommandTag", "addTag");
		addMethodMap1.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "getBlockPos", "blockPosition");
		addMethodMap1.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "getEntityWorld", "getCommandSenderWorld");
		addMethodMap1.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "getHeight", "getBbHeight");
		addMethodMap1.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "getHorizontalFacing", "getDirection");
		addMethodMap1.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "getMovementDirection", "getMotionDirection");
		addMethodMap1.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "getParticleX", "getRandomX");
		addMethodMap1.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "getParticleZ", "getRandomZ");
		addMethodMap1.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "getRandomBodyY", "getRandomY");
		addMethodMap1.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "getSwimHeight", "getFluidJumpThreshold", "method_29241");
		addMethodMap1.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "getUuidAsString", "getStringUUID");
		addMethodMap1.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "isSneaking", "isShiftKeyDown");
		addMethodMap1.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "setBodyYaw", "setYBodyRot");
		addMethodMap1.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "setHeadYaw", "setYHeadRot");
		addMethodMap1.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "setVelocity", "setDeltaMovement");
		addMethodMap1.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "tickRiding", "rideTick");
		addMethodMap1.add("ClientPlayerEntity|LivingEntity|PlayerEntity|ServerPlayerEntity", "bodyYaw", "yBodyRot");
		addMethodMap1.add("ClientPlayerEntity|LivingEntity|PlayerEntity|ServerPlayerEntity", "forwardSpeed", "zza");
		addMethodMap1.add("ClientPlayerEntity|LivingEntity|PlayerEntity|ServerPlayerEntity", "headYaw", "yHeadRot");
		addMethodMap1.add("ClientPlayerEntity|LivingEntity|PlayerEntity|ServerPlayerEntity", "prevBodyYaw", "yBodyRotO");
		addMethodMap1.add("ClientPlayerEntity|LivingEntity|PlayerEntity|ServerPlayerEntity", "prevHeadYaw", "yHeadRotO");
		addMethodMap1.add("ClientPlayerEntity|LivingEntity|PlayerEntity|ServerPlayerEntity", "setMovementSpeed", "setSpeed");
		addMethodMap1.add("ClientPlayerEntity|LivingEntity|PlayerEntity|ServerPlayerEntity", "sidewaysSpeed", "xxa");
		addMethodMap1.add("ClientPlayerEntity|LivingEntity|PlayerEntity|ServerPlayerEntity", "upwardSpeed", "yya");
		addMethodMap1.add("ClientPlayerEntity|PlayerEntity|ServerPlayerEntity", "getMainHandStack", "getMainHandItem");
		addMethodMap1.add("ClientPlayerEntity|PlayerEntity|ServerPlayerEntity", "getWidth", "getBbWidth");
		addMethodMap1.add("ClientWorld|ServerWorld|World", "containsFluid", "containsAnyLiquid");
		addMethodMap1.add("ClientWorld|ServerWorld|World", "getLunarTime", "dayTime");
		addMethodMap1.add("ClientWorld|ServerWorld|World", "getTime", "getGameTime");
		addMethodMap1.add("ClientWorld|ServerWorld|World", "isAir", "isEmptyBlock");
		addMethodMap1.add("ClientWorld|ServerWorld|World", "isWater", "isWaterAt");
		addMethodMap1.add("ClientWorld|ServerWorld|World", "spawnEntity", "addFreshEntity");
		addMethodMap1.add("ClientWorld|ServerWorld|World", "updateNeighbors", "updateNeighborsAt");
		addMethodMap1.add("CompoundTag", "getSize", "size");
		addMethodMap1.add("Direction", "byId", "from2DDataValue");
		addMethodMap1.add("Direction", "fromHorizontal", "from3DDataValue");
		addMethodMap1.add("Direction", "getHorizontal", "get2DDataValue");
		addMethodMap1.add("Direction", "getId", "get3DDataValue");
		addMethodMap1.add("Direction", "getOffsetX", "getStepX");
		addMethodMap1.add("Direction", "getOffsetY", "getStepY");
		addMethodMap1.add("Direction", "getOffsetZ", "getStepZ");
		addMethodMap1.add("Direction", "pointsTo", "isFacingAngle", "method_30928");
		addMethodMap1.add("GameOptions", "advancementsKey", "keyAdvancements");
		addMethodMap1.add("GameOptions", "attackKey", "keyAttack");
		addMethodMap1.add("GameOptions", "backKey", "keyBack", "keyDown");
		addMethodMap1.add("GameOptions", "chatKey", "keyChat");
		addMethodMap1.add("GameOptions", "commandKey", "keyCommand");
		addMethodMap1.add("GameOptions", "dropKey", "keyDrop");
		addMethodMap1.add("GameOptions", "forwardKey", "keyForward", "keyUp");
		addMethodMap1.add("GameOptions", "fullscreenKey", "keyFullscreen");
		addMethodMap1.add("GameOptions", "hudHidden", "hideGui");
		addMethodMap1.add("GameOptions", "inventoryKey", "keyInventory");
		addMethodMap1.add("GameOptions", "jumpKey", "keyJump");
		addMethodMap1.add("GameOptions", "leftKey", "keyLeft");
		addMethodMap1.add("GameOptions", "loadToolbarActivatorKey", "keyLoadHotbarActivator", "keyLoadToolbarActivator");
		addMethodMap1.add("GameOptions", "pickItemKey", "keyPickItem");
		addMethodMap1.add("GameOptions", "playerListKey", "keyPlayerList");
		addMethodMap1.add("GameOptions", "rightKey", "keyRight");
		addMethodMap1.add("GameOptions", "saveToolbarActivatorKey", "keySaveHotbarActivator", "keySaveToolbarActivator");
		addMethodMap1.add("GameOptions", "screenshotKey", "keyScreenshot");
		addMethodMap1.add("GameOptions", "smoothCameraKey", "keySmoothCamera");
		addMethodMap1.add("GameOptions", "sneakKey", "keyShift", "keySneak");
		addMethodMap1.add("GameOptions", "socialInteractionsKey", "keySocialInteractions");
		addMethodMap1.add("GameOptions", "spectatorOutlinesKey", "keySpectatorOutlines");
		addMethodMap1.add("GameOptions", "sprintKey", "keySprint");
		addMethodMap1.add("GameOptions", "swapHandsKey", "keySwapHands", "keySwapOffhand");
		addMethodMap1.add("GameOptions", "togglePerspectiveKey", "keyTogglePerspective");
		addMethodMap1.add("GameOptions", "useKey", "keyUse");
		addMethodMap1.add("ItemPlacementContext", "canReplaceExisting", "replacingClickedOnBlock");
		addMethodMap1.add("ItemPlacementContext", "getClickedFace", "getSide");
		addMethodMap1.add("ItemPlacementContext", "getPlayerFacing", "getHorizontalPlayerFacing", "getHorizontalDirection");
		addMethodMap1.add("ItemPlacementContext", "getPlayerLookDirection", "getNearestLookingDirection");
		addMethodMap1.add("ItemPlacementContext", "hitsInsideBlock", "isInside");
		addMethodMap1.add("ItemPlacementContext", "shouldCancelInteraction", "isSecondaryUseActive");
		addMethodMap1.add("ItemSettings", "fireproof", "fireResistant");
		addMethodMap1.add("ItemSettings", "maxCount", "stacksTo");
		addMethodMap1.add("ItemSettings", "maxDamage", "durability");
		addMethodMap1.add("ItemSettings", "maxDamageIfAbsent", "defaultDurability");
		addMethodMap1.add("ItemStack", "decrement", "shrink");
		addMethodMap1.add("ItemStack", "getOrCreateTag", "getOrCreateNbt");
		addMethodMap1.add("ItemStack", "getTag", "getNbt");
		addMethodMap1.add("ItemStack", "increment", "grow");
		addMethodMap1.add("ItemUsageContext", "getHorizontalPlayerFacing", "getHorizontalDirection", "getPlayerFacing");
		addMethodMap1.add("ItemUsageContext", "getSide", "getClickedFace");
		addMethodMap1.add("ItemUsageContext", "hitsInsideBlock", "isInside");
		addMethodMap1.add("ItemUsageContext", "shouldCancelInteraction", "isSecondaryUseActive");
		addMethodMap1.add("KeyBinding", "getBoundKeyTranslationKey", "saveString");
		addMethodMap1.add("KeyBinding", "getTranslationKey", "getName");
		addMethodMap1.add("KeyBinding", "isPressed", "isDown");
		addMethodMap1.add("KeyBinding", "unpressAll", "releaseAll");
		addMethodMap1.add("KeyBinding", "updateKeysByCode", "resetMapping");
		addMethodMap1.add("KeyBinding", "updatePressedStates", "setAll");
		addMethodMap1.add("KeyBinding", "wasPressed", "consumeClick");
		addMethodMap1.add("LightmapTextureManager", "disable", "turnOffLightLayer");
		addMethodMap1.add("LightmapTextureManager", "enable", "turnOnLightLayer");
		addMethodMap1.add("LightmapTextureManager", "getBlockLightCoordinates", "block");
		addMethodMap1.add("LightmapTextureManager", "getSkyLightCoordinates", "sky");
		addMethodMap1.add("MapColor", "BLACK", "COLOR_BLACK");
		addMethodMap1.add("MapColor", "BLUE", "COLOR_BLUE");
		addMethodMap1.add("MapColor", "BRIGHT_RED", "FIRE");
		addMethodMap1.add("MapColor", "BRIGHT_TEAL", "field_25708", "WARPED_WART_BLOCK");
		addMethodMap1.add("MapColor", "BROWN", "COLOR_BROWN");
		addMethodMap1.add("MapColor", "CLEAR", "NONE");
		addMethodMap1.add("MapColor", "CYAN", "COLOR_CYAN");
		addMethodMap1.add("MapColor", "DARK_AQUA", "field_25706", "WARPED_STEM");
		addMethodMap1.add("MapColor", "DARK_CRIMSON", "field_25704", "CRIMSON_HYPHAE");
		addMethodMap1.add("MapColor", "DARK_DULL_PINK", "field_25707", "WARPED_HYPHAE");
		addMethodMap1.add("MapColor", "DARK_GREEN", "PLANT");
		addMethodMap1.add("MapColor", "DARK_RED", "NETHER");
		addMethodMap1.add("MapColor", "DIAMOND_BLUE", "DIAMOND");
		addMethodMap1.add("MapColor", "DIRT_BROWN", "DIRT");
		addMethodMap1.add("MapColor", "DULL_PINK", "field_25703", "CRIMSON_STEM");
		addMethodMap1.add("MapColor", "DULL_RED", "field_25702", "CRIMSON_NYLIUM");
		addMethodMap1.add("MapColor", "EMERALD_GREEN", "EMERALD");
		addMethodMap1.add("MapColor", "GRAY", "COLOR_GRAY");
		addMethodMap1.add("MapColor", "GREEN", "COLOR_GREEN");
		addMethodMap1.add("MapColor", "IRON_GRAY", "METAL");
		addMethodMap1.add("MapColor", "LAPIS_BLUE", "LAPIS");
		addMethodMap1.add("MapColor", "LIGHT_BLUE", "COLOR_LIGHT_BLUE");
		addMethodMap1.add("MapColor", "LIGHT_BLUE_GRAY", "CLAY");
		addMethodMap1.add("MapColor", "LIGHT_GRAY", "COLOR_LIGHT_GRAY");
		addMethodMap1.add("MapColor", "LIME", "COLOR_LIGHT_GREEN");
		addMethodMap1.add("MapColor", "MAGENTA", "COLOR_MAGENTA");
		addMethodMap1.add("MapColor", "OAK_TAN", "WOOD");
		addMethodMap1.add("MapColor", "OFF_WHITE", "QUARTZ");
		addMethodMap1.add("MapColor", "ORANGE", "COLOR_ORANGE");
		addMethodMap1.add("MapColor", "PALE_GREEN", "GRASS");
		addMethodMap1.add("MapColor", "PALE_PURPLE", "ICE");
		addMethodMap1.add("MapColor", "PALE_YELLOW", "SAND");
		addMethodMap1.add("MapColor", "PINK", "COLOR_PINK");
		addMethodMap1.add("MapColor", "PURPLE", "COLOR_PURPLE");
		addMethodMap1.add("MapColor", "RED", "COLOR_RED");
		addMethodMap1.add("MapColor", "SPRUCE_BROWN", "PODZOL");
		addMethodMap1.add("MapColor", "STONE_GRAY", "STONE");
		addMethodMap1.add("MapColor", "TEAL", "field_25705", "WARPED_NYLIUM");
		addMethodMap1.add("MapColor", "TERRACOTTA_LIME", "TERRACOTTA_LIGHT_GREEN");
		addMethodMap1.add("MapColor", "WATER_BLUE", "WATER");
		addMethodMap1.add("MapColor", "WHITE", "SNOW");
		addMethodMap1.add("MapColor", "WHITE_GRAY", "WOOL");
		addMethodMap1.add("MapColor", "YELLOW", "COLOR_YELLOW");
		addMethodMap1.add("MathHelper", "clampAngle", "rotateIfNecessary", "stepAngleTowards");
		addMethodMap1.add("MathHelper", "floorDiv", "intFloorDiv");
		addMethodMap1.add("MathHelper", "floorMod", "positiveModulo");
		addMethodMap1.add("MathHelper", "fractionalPart", "frac");
		addMethodMap1.add("MathHelper", "perlinFade", "smoothstep");
		addMethodMap1.add("MathHelper", "roundUpToMultiple", "roundToward", "roundUp");
		addMethodMap1.add("MathHelper", "SQUARE_ROOT_OF_TWO", "SQRT_OF_TWO");
		addMethodMap1.add("MathHelper", "stepTowards", "approach");
		addMethodMap1.add("MathHelper", "stepUnwrappedAngleTowards", "approachDegrees");
		addMethodMap1.add("MinecraftClient", "getLastFrameDuration", "getDeltaFrameTime");
		addMethodMap1.add("MinecraftClient", "getTickDelta", "getFrameTime");
		addMethodMap1.add("MinecraftClient", "setScreen", "openScreen");
		addMethodMap1.add("MinecraftServer", "getRunDirectory", "getServerDirectory");
		addMethodMap1.add("NativeImage", "setColor", "setPixelColor", "setPixelRGBA");
		addMethodMap1.add("NativeImageFormat", "RGB", "BGR");
		addMethodMap1.add("NativeImageFormat", "RGBA", "ABGR");
		addMethodMap1.add("OverlayTexture", "DEFAULT_UV", "NO_OVERLAY");
		addMethodMap1.add("RenderLayer", "endDrawing", "clearRenderState");
		addMethodMap1.add("RenderLayer", "getArmorCutoutNoCull", "armorCutoutNoCull");
		addMethodMap1.add("RenderLayer", "getArmorEntityGlint", "armorEntityGlint");
		addMethodMap1.add("RenderLayer", "getArmorGlint", "armorGlint");
		addMethodMap1.add("RenderLayer", "getBeaconBeam", "beaconBeam");
		addMethodMap1.add("RenderLayer", "getBlockBreaking", "crumbling");
		addMethodMap1.add("RenderLayer", "getCutout", "cutout");
		addMethodMap1.add("RenderLayer", "getCutoutMipped", "cutoutMipped");
		addMethodMap1.add("RenderLayer", "getDirectEntityGlint", "entityGlintDirect");
		addMethodMap1.add("RenderLayer", "getDirectGlint", "glintDirect");
		addMethodMap1.add("RenderLayer", "getEntityCutout", "entityCutout");
		addMethodMap1.add("RenderLayer", "getEntityCutoutNoCull", "entityCutoutNoCull");
		addMethodMap1.add("RenderLayer", "getEntityCutoutNoCullZOffset", "entityCutoutNoCullZOffset");
		addMethodMap1.add("RenderLayer", "getEntityDecal", "entityDecal");
		addMethodMap1.add("RenderLayer", "getEntityGlint", "entityGlint");
		addMethodMap1.add("RenderLayer", "getEntityNoOutline", "entityNoOutline");
		addMethodMap1.add("RenderLayer", "getEntityShadow", "entityShadow");
		addMethodMap1.add("RenderLayer", "getEntitySmoothCutout", "entitySmoothCutout");
		addMethodMap1.add("RenderLayer", "getEntitySolid", "entitySolid");
		addMethodMap1.add("RenderLayer", "getEntityTranslucent", "entityTranslucent");
		addMethodMap1.add("RenderLayer", "getEntityTranslucentCull", "entityTranslucentCull");
		addMethodMap1.add("RenderLayer", "getExpectedBufferSize", "bufferSize");
		addMethodMap1.add("RenderLayer", "getEyes", "eyes");
		addMethodMap1.add("RenderLayer", "getGlint", "glint");
		addMethodMap1.add("RenderLayer", "getGlintTranslucent", "glintTranslucent", "method_30676");
		addMethodMap1.add("RenderLayer", "getItemEntityTranslucentCull", "itemEntityTranslucentCull");
		addMethodMap1.add("RenderLayer", "getLeash", "leash");
		addMethodMap1.add("RenderLayer", "getLightning", "lightning");
		addMethodMap1.add("RenderLayer", "getLines", "lines");
		addMethodMap1.add("RenderLayer", "getSolid", "solid");
		addMethodMap1.add("RenderLayer", "getText", "text");
		addMethodMap1.add("RenderLayer", "getTextSeeThrough", "textSeeThrough");
		addMethodMap1.add("RenderLayer", "getTranslucent", "translucent");
		addMethodMap1.add("RenderLayer", "getTranslucentMovingBlock", "translucentMovingBlock");
		addMethodMap1.add("RenderLayer", "getTripwire", "tripwire");
		addMethodMap1.add("RenderLayer", "getWaterMask", "waterMask");
		addMethodMap1.add("RenderLayer", "hasCrumbling", "affectsCrumbling");
		addMethodMap1.add("RenderLayer", "startDrawing", "setupRenderState");
		addMethodMap1.add("Scoreboard", "addTeam", "addPlayerTeam");
		addMethodMap1.add("Scoreboard", "getObjectives");
		addMethodMap1.add("Scoreboard", "getTeam", "getPlayersTeam");
		addMethodMap1.add("Scoreboard", "removeTeam", "removePlayerTeam");
		addMethodMap1.add("Scoreboard", "updateExistingObjective", "onObjectiveChanged");
		addMethodMap1.add("Scoreboard", "updateObjective", "onObjectiveAdded");
		addMethodMap1.add("Scoreboard", "updateRemovedObjective", "onObjectiveRemoved");
		addMethodMap1.add("Scoreboard", "updateRemovedTeam", "onTeamRemoved");
		addMethodMap1.add("Scoreboard", "updateScoreboardTeam", "onTeamChanged");
		addMethodMap1.add("Scoreboard", "updateScoreboardTeamAndPlayers", "onTeamAdded");
		addMethodMap1.add("Screen", "close", "onClose");
		addMethodMap1.add("Screen", "OPTIONS_BACKGROUND_TEXTURE", "BACKGROUND_LOCATION");
		addMethodMap1.add("Screen", "shouldPause", "isPauseScreen");
		addMethodMap1.add("TextFieldWidget", "eraseCharacters", "deleteChars");
		addMethodMap1.add("TextFieldWidget", "eraseWords", "deleteWords");
		addMethodMap1.add("TextFieldWidget", "getCharacterX", "getScreenX");
		addMethodMap1.add("TextFieldWidget", "getCursor", "getCursorPosition");
		addMethodMap1.add("TextFieldWidget", "getSelectedText", "getHighlighted");
		addMethodMap1.add("TextFieldWidget", "getText", "getValue");
		addMethodMap1.add("TextFieldWidget", "getWordSkipPosition", "getWordPosition");
		addMethodMap1.add("TextFieldWidget", "setDrawsBackground", "setBordered");
		addMethodMap1.add("TextFieldWidget", "setEditableColor", "setTextColor");
		addMethodMap1.add("TextFieldWidget", "setFocused", "setFocus", "setTextFieldFocused");
		addMethodMap1.add("TextFieldWidget", "setFocusUnlocked", "setCanLoseFocus");
		addMethodMap1.add("TextFieldWidget", "setSelectionEnd", "setCursorPosition");
		addMethodMap1.add("TextFieldWidget", "setSelectionStart", "setHighlightPos");
		addMethodMap1.add("TextFieldWidget", "setText", "setValue");
		addMethodMap1.add("TextFieldWidget", "setUneditableColor", "setTextColorUneditable");
		addMethodMap1.add("TextFieldWidget", "write", "insertText");
		addMethodMap1.add("TextureManager", "bindTexture", "bind", "bindForSetup");
		addMethodMap1.add("TextureManager", "destroyTexture", "release");
		addMethodMap1.add("Vector3d", "crossProduct", "cross");
		addMethodMap1.add("Vector3d", "dotProduct", "dot");
		addMethodMap1.add("Vector3d", "lengthSquared", "lengthSqr");
		addMethodMap1.add("Vector3d", "of", "atLowerCornerOf");
		addMethodMap1.add("Vector3d", "ofBottomCenter", "atBottomCenterOf");
		addMethodMap1.add("Vector3d", "relativize", "vectorTo");
		addMethodMap1.add("Vector3d", "rotateX", "xRot");
		addMethodMap1.add("Vector3d", "rotateY", "yRot");
		addMethodMap1.add("Vector3d", "rotateZ", "zRot");
		addMethodMap1.add("Vector3i", "crossProduct", "cross");
		addMethodMap1.add("Vector3i", "down", "above");
		addMethodMap1.add("Vector3i", "up", "below");
		addMethodMap1.add("VertexFormats", "COLOR_ELEMENT", "ELEMENT_COLOR");
		addMethodMap1.add("VertexFormats", "LIGHT_ELEMENT", "ELEMENT_UV2");
		addMethodMap1.add("VertexFormats", "NORMAL_ELEMENT", "ELEMENT_NORMAL");
		addMethodMap1.add("VertexFormats", "OVERLAY_ELEMENT", "ELEMENT_UV1");
		addMethodMap1.add("VertexFormats", "PADDING_ELEMENT", "ELEMENT_PADDING");
		addMethodMap1.add("VertexFormats", "POSITION_COLOR_LIGHT", "POSITION_COLOR_LIGHTMAP");
		addMethodMap1.add("VertexFormats", "POSITION_COLOR_TEXTURE", "POSITION_COLOR_TEX");
		addMethodMap1.add("VertexFormats", "POSITION_COLOR_TEXTURE_LIGHT", "POSITION_COLOR_TEX_LIGHTMAP");
		addMethodMap1.add("VertexFormats", "POSITION_COLOR_TEXTURE_LIGHT_NORMAL", "BLOCK");
		addMethodMap1.add("VertexFormats", "POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL", "NEW_ENTITY");
		addMethodMap1.add("VertexFormats", "POSITION_ELEMENT", "ELEMENT_POSITION");
		addMethodMap1.add("VertexFormats", "POSITION_TEXTURE", "POSITION_TEX");
		addMethodMap1.add("VertexFormats", "POSITION_TEXTURE_COLOR", "POSITION_TEX_COLOR");
		addMethodMap1.add("VertexFormats", "POSITION_TEXTURE_COLOR_LIGHT", "PARTICLE");
		addMethodMap1.add("VertexFormats", "POSITION_TEXTURE_COLOR_NORMAL", "POSITION_TEX_COLOR_NORMAL");
		addMethodMap1.add("VertexFormats", "POSITION_TEXTURE_LIGHT_COLOR", "POSITION_TEX_LIGHTMAP_COLOR");
		addMethodMap1.add("VertexFormats", "UV_ELEMENT", "ELEMENT_UV0", "TEXTURE_0_ELEMENT");
		addMethodMap1.add("Window", "applyVideoMode", "changeFullscreenVideoMode");
		addMethodMap1.add("Window", "getFramebufferHeight", "getScreenHeight");
		addMethodMap1.add("Window", "getFramebufferWidth", "getScreenWidth");
		addMethodMap1.add("Window", "getScaledHeight", "getGuiScaledHeight");
		addMethodMap1.add("Window", "getScaledWidth", "getGuiScaledWidth");
		addMethodMap1.add("Window", "logOnGlError", "setDefaultErrorCallback");
		addMethodMap1.add("Window", "setRawMouseMotion", "updateRawMouseInput");
		addMethodMap1.add("Window", "setVsync", "updateVsync");
		addMethodMap1.add("Window", "swapBuffers", "updateDisplay");
		addMethodMap1.add("Window", "toggleFullscreen", "toggleFullScreen");
		addMethodMap2.add("AbstractSoundInstance|MovingSoundInstance", "canPlay", "public boolean ()", "canPlaySound");
		addMethodMap2.add("AbstractSoundInstance|MovingSoundInstance", "shouldAlwaysPlay", "public boolean ()", "canStartSilent");
		addMethodMap2.add("BlockEntity", "markDirty", "public void ()", "setChanged");
		addMethodMap2.add("BlockItem|Item", "hasRecipeRemainder", "public boolean ()", "hasCraftingRemainingItem");
		addMethodMap2.add("BlockPos", "add", "public BlockPos (Vector3i)", "offset");
		addMethodMap2.add("BlockState", "emitsRedstonePower", "public boolean ()", "isSignalSource");
		addMethodMap2.add("BlockState", "exceedsCube", "public boolean ()", "hasLargeCollisionShape");
		addMethodMap2.add("BlockState", "getAmbientOcclusionLightLevel", "public float (BlockView,BlockPos)", "getShadeBrightness");
		addMethodMap2.add("BlockState", "getCullingShape", "public VoxelShape (BlockView,BlockPos)", "getOcclusionShape");
		addMethodMap2.add("BlockState", "getHardness", "public float (BlockView,BlockPos)", "getDestroySpeed");
		addMethodMap2.add("BlockState", "getOutlineShape", "public VoxelShape (BlockView,BlockPos)", "getShape");
		addMethodMap2.add("BlockState", "getRaycastShape", "public VoxelShape (BlockView,BlockPos)", "getInteractionShape");
		addMethodMap2.add("BlockState", "getSidesShape", "public VoxelShape (BlockView,BlockPos)", "getBlockSupportShape");
		addMethodMap2.add("BlockState", "getStrongRedstonePower", "public int (BlockView,BlockPos,Direction)", "getDirectSignal");
		addMethodMap2.add("BlockState", "getWeakRedstonePower", "public int (BlockView,BlockPos,Direction)", "getSignal");
		addMethodMap2.add("BlockState", "hasComparatorOutput", "public boolean ()", "hasAnalogOutputSignal");
		addMethodMap2.add("BlockState", "hasEmissiveLighting", "public boolean (BlockView,BlockPos)", "emissiveRendering");
		addMethodMap2.add("BlockState", "hasRandomTicks", "public boolean ()", "isRandomlyTicking");
		addMethodMap2.add("BlockState", "hasSidedTransparency", "public boolean ()", "useShapeForLightOcclusion");
		addMethodMap2.add("BlockState", "isFullCube", "public boolean (BlockView,BlockPos)", "isCollisionShapeFullBlock");
		addMethodMap2.add("BlockState", "isOpaque", "public boolean ()", "canOcclude");
		addMethodMap2.add("BlockState", "isOpaqueFullCube", "public boolean (BlockView,BlockPos)", "isSolidRender");
		addMethodMap2.add("BlockState", "isSolidBlock", "public boolean (BlockView,BlockPos)", "isRedstoneConductor");
		addMethodMap2.add("BlockState", "isToolRequired", "public boolean ()", "requiresCorrectToolForDrops");
		addMethodMap2.add("BlockState", "isTransparent", "public boolean (BlockView,BlockPos)", "isTranslucent", "propagatesSkylightDown");
		addMethodMap2.add("BlockState", "prepare", "public final void (WorldAccess,BlockPos,int)", "updateIndirectNeighbourShapes");
		addMethodMap2.add("BlockState", "shouldBlockVision", "public boolean (BlockView,BlockPos)", "isViewBlocking");
		addMethodMap2.add("BlockState", "shouldPostProcess", "public boolean (BlockView,BlockPos)", "hasPostProcess");
		addMethodMap2.add("BlockState", "shouldSuffocate", "public boolean (BlockView,BlockPos)", "isSuffocating");
		addMethodMap2.add("BlockState", "updateNeighbors", "public final void (WorldAccess,BlockPos,int)", "updateNeighbourShapes");
		addMethodMap2.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "addVelocity", "public void (double,double,double)", "push");
		addMethodMap2.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "getBodyY", "public double (double)", "getY");
		addMethodMap2.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "getPitch", "public float (float)", "getViewXRot");
		addMethodMap2.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "getPosition", "public Vector3d ()", "getPos", "position");
		addMethodMap2.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "getStandingEyeHeight", "public final float ()", "getEyeHeight");
		addMethodMap2.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "getYaw", "public float (float)", "getViewYRot");
		addMethodMap2.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "offsetX", "public double (double)", "getX");
		addMethodMap2.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "offsetZ", "public double (double)", "getZ");
		addMethodMap2.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "pushAwayFrom", "public void (Entity)", "push");
		addMethodMap2.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "refreshPositionAfterTeleport", "public void (double,double,double)", "moveTo");
		addMethodMap2.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "refreshPositionAfterTeleport", "public void (Vector3d)", "moveTo");
		addMethodMap2.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "refreshPositionAndAngles", "public void (double,double,double,float,float)", "moveTo");
		addMethodMap2.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "updatePosition", "public void (double,double,double)", "absMoveTo");
		addMethodMap2.add("ClientPlayerEntity|Entity|LivingEntity|PlayerEntity|ServerPlayerEntity", "updatePositionAndAngles", "public void (double,double,double,float,float)", "absMoveTo");
		addMethodMap2.add("ClientPlayerEntity|Entity|PlayerEntity", "getCameraPosVec", "public final Vector3d (float)", "getEyePosition");
		addMethodMap2.add("ClientPlayerEntity|Entity|PlayerEntity", "getClientCameraPosVec", "public final Vector3d (float)", "getLightProbePosition");
		addMethodMap2.add("ClientPlayerEntity|Entity|PlayerEntity", "getLeashPos", "public final Vector3d (float)", "getRopeHoldPosition", "method_30951");
		addMethodMap2.add("ClientPlayerEntity|Entity|PlayerEntity", "getLerpedPos", "public final Vector3d (float)", "getPosition", "method_30950");
		addMethodMap2.add("ClientPlayerEntity|Entity|PlayerEntity", "getOppositeRotationVector", "public final Vector3d (float)", "getUpVector");
		addMethodMap2.add("ClientPlayerEntity|Entity|PlayerEntity", "getRotationVec", "public final Vector3d (float)", "getViewVector");
		addMethodMap2.add("Direction", "rotateYClockwise", "public Direction ()", "getClockWise");
		addMethodMap2.add("Direction", "rotateYCounterclockwise", "public Direction ()", "getCounterClockWise");
		addMethodMap2.add("MathHelper", "ceilLog2", "public static int (int)", "ceillog2", "log2DeBruijn");
		addMethodMap2.add("MathHelper", "fastInverseCbrt", "public static float (float)", "fastInvCubeRoot");
		addMethodMap2.add("MathHelper", "fastInverseSqrt", "public static double (double)", "fastInvSqrt");
		addMethodMap2.add("MathHelper", "floorLog2", "public static int (int)", "log2");
		addMethodMap2.add("MathHelper", "idealHash", "public static int (int)", "murmurHash3Mixer");
		addMethodMap2.add("MathHelper", "lerpAngleDegrees", "public static float (float,float,float)", "rotLerp");
		addMethodMap2.add("RenderLayer", "getOutline", "public static RenderLayer (Identifier)", "outline");
		addMethodMap2.add("ScoreboardScore", "setScore", "public void (int)", "value");
		addMethodMap2.add("ServerPlayerEntity", "sendMessage", "public void (Text,boolean)", "displayClientMessage");
		addMethodMap2.add("ServerWorld|World", "isChunkLoaded", "public boolean (int,int)", "hasChunk");
		addMethodMap2.add("ServerWorld|World", "isSavingDisabled", "public boolean ()", "noSave");
		addMethodMap2.add("ServerWorld|World|WorldView", "isClient", "public boolean ()", "isClientSide");
		addMethodMap2.add("Vector3d", "getX", "public double ()", "x");
		addMethodMap2.add("Vector3d", "getY", "public double ()", "y");
		addMethodMap2.add("Vector3d", "getZ", "public double ()", "z");
		addMethodMap2.add("Vector3f", "getX", "public float ()", "x");
		addMethodMap2.add("Vector3f", "getY", "public float ()", "y");
		addMethodMap2.add("Vector3f", "getZ", "public float ()", "z");
		addMethodMap2.add("VoxelShapes", "adjacentSidesCoverSquare", "public static boolean (VoxelShape,VoxelShape,Direction)", "mergedFaceOccludes");
		addMethodMap2.add("VoxelShapes", "combine", "public static VoxelShape (VoxelShape,VoxelShape,BooleanBiFunction)", "joinUnoptimized");
		addMethodMap2.add("VoxelShapes", "combineAndSimplify", "public static VoxelShape (VoxelShape,VoxelShape,BooleanBiFunction)", "join");
		addMethodMap2.add("VoxelShapes", "cuboid", "public static VoxelShape (double,double,double,double,double,double)", "box");
		addMethodMap2.add("VoxelShapes", "isSideCovered", "public static boolean (VoxelShape,VoxelShape,Direction)", "blockOccudes");
		blacklist.add("BlockEntityType", "get", "public T (BlockView,BlockPos)");
		blacklist.add("CompoundTag", "getType", "public byte ()");
		blacklist.add("EntityType", "create", "public T (World)");
	}
}
