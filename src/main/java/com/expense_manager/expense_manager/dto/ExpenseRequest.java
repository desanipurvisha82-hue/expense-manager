package com.expense_manager.expense_manager.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.expense_manager.expense_manager.entity.Category;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseRequest {

    @NotBlank
    private String title;

    @NotNull
    private BigDecimal amount;

    @NotBlank
    private String currency;

    private String note;

    @NotNull
    private Category category;

    @NotNull
    private LocalDate expenseDate;
}