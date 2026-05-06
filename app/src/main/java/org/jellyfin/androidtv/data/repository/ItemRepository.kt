package org.jellyfin.androidtv.data.repository

import org.jellyfin.sdk.model.api.ItemFields

object ItemRepository {
	val itemFields = setOf(
		ItemFields.CAN_DELETE,
		ItemFields.CHANNEL_INFO,
		ItemFields.CHAPTERS,
		ItemFields.CHILD_COUNT,
		ItemFields.CUMULATIVE_RUN_TIME_TICKS,
		ItemFields.DATE_CREATED,
		ItemFields.DISPLAY_PREFERENCES_ID,
		ItemFields.GENRES,
		ItemFields.ITEM_COUNTS,
		ItemFields.MEDIA_SOURCE_COUNT,
		ItemFields.MEDIA_SOURCES,
		ItemFields.MEDIA_STREAMS,
		ItemFields.OVERVIEW,
		ItemFields.PATH,
		ItemFields.PRIMARY_IMAGE_ASPECT_RATIO,
		ItemFields.TAGLINES,
		ItemFields.TRICKPLAY,
	)

	// Minimal field set for home screen rows. Cards only render image, name,
	// type-specific subtext (e.g. "x episodes" via CHILD_COUNT) and aspect
	// ratio. OVERVIEW in particular adds significant payload per item and is
	// not displayed on home cards. Full item data is fetched when the user
	// opens an item.
	val browseFields = setOf(
		ItemFields.CHILD_COUNT,
		ItemFields.PRIMARY_IMAGE_ASPECT_RATIO,
	)
}
