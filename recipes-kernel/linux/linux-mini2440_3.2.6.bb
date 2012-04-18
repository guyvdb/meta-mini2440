DESCRIPTION = "Linux Kernel for mini2440"
SECTION = "kernel"
LICENSE = "GPLv2"
PR = "r0"

inherit kernel

COMPATIBLE_MACHINE = "(mini2440|micro2440)"

LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"



SRC_URI = " \
	${KERNELORG_MIRROR}/linux/kernel/v3.x/linux-${PV}.tar.bz2 \    
	file://defconfig \
        file://PATCH_1_4_s3c2440_mini2440_Add_support_for_new_LCD_panels.diff;patch=1 \
        file://add_lcd_w35i.diff;patch=1 \
        file://PATCH_2_4_s3c2440_mini2440_Add_touchscreen_support_for_mini2440.diff;patch=1 \
        file://PATCH_3_4_s3c2440_mini2440_Select_touchscreen_by_default.diff;patch=1 \
        file://PATCH_4_4_s3c2440_mini2440_Use_leds-gpio_driver_for_board_leds_handling.diff;patch=1 \
        file://PATCH_2_3_rtc-s3c_Disable_alarm_entries_that_are_not_chosen.diff;patch=1 \        
        file://speed_up_NAND_mounting.diff;patch=1 \
        file://make_all_const.diff;patch=1 \
        file://remove_device_file.diff;patch=1 \
        file://make_debug_decision_const.diff;patch=1 \
        file://just_a_cleanup.diff;patch=1 \
        file://enable_screen_without_console.diff;patch=1 \
        file://add_hwmon.diff;patch=1 \
        file://fix_ts_race.diff;patch=1 \
        file://fix_backlight_GPIO_handling.diff;patch=1 \
        file://add_display_size_in_kernel.diff;patch=1 \
        file://add_display_sizes_to_mini2440.diff;patch=1 \
        file://n43i_display_unit.diff;patch=1 \
        file://enable_button_6.diff;patch=1 \
        file://fix_pwm.diff;patch=1 \
        file://add_buzzer.diff;patch=1 \
        file://SAMSUNG_Add_over_sampling_preventing_code.diff;patch=1 \
	"


#file://dm9000_Make_the_driver_follow_the_IRQF_SHARED_contract.patch;patch=1 \







S = "${WORKDIR}/linux-${PV}"