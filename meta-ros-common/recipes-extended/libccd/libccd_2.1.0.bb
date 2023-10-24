DESCRIPTION = "libccd is library for a collision detection between two convex shapes."
HOMEPAGE = "https://github.com/danfis/libccd"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://BSD-LICENSE;md5=ff7a32175d897961df3eec70a6166429"

SRCREV = "7931e764a19ef6b21b443376c699bbc9c6d4fba8"
ROS_BRANCH ?= "branch=master"
SRC_URI = "git://github.com/danfis/libccd;${ROS_BRANCH};protocol=https \
    file://0001-CMakeLists.txt-make-package-relocatable.patch \
"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=Release -DCCD_DOUBLE=1 -DBUILD_TESTING=OFF"

inherit pkgconfig cmake

FILES:${PN}-dev += "${libdir}/ccd/*.cmake"
