FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-CMakeLists.txt-pull-in-rosidl-default-generators.patch \
"

ROS_BUILD_DEPENDS:append = " \
    rosidl-generator-py \
    python3-numpy \
"

