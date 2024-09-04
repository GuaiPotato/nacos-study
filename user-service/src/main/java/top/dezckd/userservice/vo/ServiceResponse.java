package top.dezckd.userservice.vo;

/**
 * @Author DEZ
 * @Date 2024/9/4
 * @Description ServiceResponse
 */
public sealed interface ServiceResponse permits SuccessResponse, ErrorResponse {}
